package esercizi.esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente clienteAssociato;
    private List<Articolo> articoli;
    private int totaleCarrello;

    public Carrello(Cliente cliente){
        this.clienteAssociato = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCarrello = 0;
    }
}
