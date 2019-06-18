package ueb10.formen;

public class Quader extends Volumen{
	private double a;
	private double b;


	public Quader(double a, double b, double h) {
		super(h);
		this.a = a;
		this.b = b;
	}

	public double berechneGrundflaeche(){
		return a * b;
	}

	/*
	public double volumen(){
		return berechneGrundflaeche() * h;
	}

	 */
}
