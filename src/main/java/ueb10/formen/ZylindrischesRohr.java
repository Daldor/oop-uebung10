package ueb10.formen;

public class ZylindrischesRohr extends Volumen{
	private double r1;
	private double r2;


	public ZylindrischesRohr(double r1, double r2, double h) {
		super(h);
		this.r1 = r1;
		this.r2 = r2;
	}

	public double berechneGrundflaeche(){
		return (Math.PI * r1 * r1) - (Math.PI * r2 * r2);
	}

	/*
	public double volumen(){
		return berechneGrundflaeche() * h;
	}

	 */
}
