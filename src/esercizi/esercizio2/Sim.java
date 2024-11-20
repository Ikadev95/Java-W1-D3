package esercizi.esercizio2;

public class Sim {
    private String numeroDiTelefono;
    private int credito;
    private Chiamata[] chiamate;

    public void getSim (){
        System.out.println("numero di telefono: " + this.numeroDiTelefono);
        System.out.println("credito: " + this.credito);

        if(this.chiamate.length == 0){
            System.out.println("non ci sono chiamate");
        }
        else {
            for (Chiamata chiamata : this.chiamate) {
                System.out.println(chiamata);
            }
        }
    }

    public Sim(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.chiamate = new Chiamata[0];
    }

}
