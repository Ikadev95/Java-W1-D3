package esercizi.esercizio3;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date data;

    public Cliente(int codiceCliente, Date data, String email, String cognome, String nome) {
        this.codiceCliente = codiceCliente;
        this.data = data;
        this.email = email;
        this.cognome = cognome;
        this.nome = nome;
    }
}
