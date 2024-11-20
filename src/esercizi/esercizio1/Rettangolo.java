package esercizi.esercizio1;

public class Rettangolo {
    private float altezza;
    private float base;

    public Rettangolo(float altezza, float base) {
        this.altezza = altezza;
        this.base = base;
    }

    public float getArea(){
        return base * altezza;
    }

    public float getPerimetro(){
        return (altezza*2) +(base*2);
    }

}
