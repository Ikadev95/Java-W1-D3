package esercizi.esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int pezziDisponibiliInMagazzino;

    public Articolo(String descrizioneArticolo, int codiceArticolo, int pezziDisponibiliInMagazzino, int prezzo) {
        this.descrizioneArticolo = descrizioneArticolo;
        this.codiceArticolo = codiceArticolo;
        this.pezziDisponibiliInMagazzino = pezziDisponibiliInMagazzino;
        this.prezzo = prezzo;
    }
}
