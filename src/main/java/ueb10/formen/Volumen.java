package ueb10.formen;

public abstract class Volumen {

    double h;

    public Volumen(){
        this.h = 0.0;
    }

    public Volumen(double h){
        this.h = h;
    }

    abstract public double berechneGrundflaeche();

    public double volumen(){
        return berechneGrundflaeche() * h;
    }
}
