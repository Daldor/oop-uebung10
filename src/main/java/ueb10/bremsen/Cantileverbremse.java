package ueb10.bremsen;

public class Cantileverbremse extends Bremse {
	private static final int MAX_BELAG = 5;
	private static final int MIN_BELAG = 1;

	private int belagLinks;
	private int belagRechts;

	public Cantileverbremse() {
		this.belagLinks = this.belagRechts = MAX_BELAG;
	}

	public Cantileverbremse(int belagRechts, int belagLinks){
		super("Continental", "12345678");
		this.belagRechts = belagRechts;
		this.belagLinks = belagLinks;
	}

	public Cantileverbremse(String hersteller, String seriennummer, int belagLinks, int belagRechts){
		super(hersteller, seriennummer);
		this.belagLinks = belagLinks;
		this.belagRechts = belagRechts;
	}
	public void bremsen() {
		System.out.println("Cantileverbremse bremst!");
	}

	public boolean brauchtService() {
		return belagLinks > MIN_BELAG && belagRechts > MIN_BELAG;
	}

	public String toString() {
		return "Cantileverbremse";
	}
}
