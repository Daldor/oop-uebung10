package ueb10.formen;

public class Zylinder extends Volumen{
	private double r;


	public Zylinder(double r, double h) {
		super(h);
		this.r = r;
	}

	public double berechneGrundflaeche(){
		return Math.PI * r * r;
	}

	/*
	public double volumen(){
		return berechneGrundflaeche() * h;
	}

	 */
}
