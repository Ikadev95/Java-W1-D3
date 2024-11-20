package esercizi.esercizio1;

public class Main {

    public static void stampaRettangolo (Rettangolo rettangolo){
        System.out.println("perimetro: " + rettangolo.getPerimetro());
        System.out.println("area:" + rettangolo.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("area rettangolo1: " + r1.getArea());
        System.out.println("perimetro rettangolo1: " + r1.getPerimetro());
        System.out.println("area rettangolo2: " + r2.getArea());
        System.out.println("perimetro rettangolo2: " + r2.getPerimetro());
        System.out.println("**************");
        System.out.println("area totale: " + (r1.getArea() + r2.getArea()) );
        System.out.println("perimetro totale: " + (r1.getPerimetro() + r2.getPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(3,5);
        Rettangolo rettangolo2 = new Rettangolo (4,6);

        stampaRettangolo(rettangolo1);
        System.out.println("**************");
        stampaDueRettangoli(rettangolo1,rettangolo2);

    }
}
