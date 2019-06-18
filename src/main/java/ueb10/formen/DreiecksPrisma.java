package ueb10.formen;

public class DreiecksPrisma extends Volumen{
	private double a;
	private double b;
	private double c;


	public DreiecksPrisma(double a, double b, double c, double h) {
		super(h);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double berechneGrundflaeche(){
		double s;
		double flaeche;

		s = (a + b + c) / 2;
		flaeche = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		return flaeche;
	}

}
