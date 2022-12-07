package it.unisa.Noleggio;
import java.util.ArrayList;
import java.util.Scanner;

public class Noleggio extends Film {
    public int giorniritardo;
    public int id;

    public Noleggio(String nome ,String codice,int giorniritardo,int id) {
        super(nome,codice);
        if (id < 0) {
            throw new IllegalArgumentException("errore id negativo");
        }

        this.id = id;
        this.giorniritardo = giorniritardo;
    }



    public double penaleNoleggio(int giorniritardo) {
        double penale = 0;
        String tipo;
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci il tipo del film noleggiato");
        tipo = in.nextLine();
        if (tipo.compareTo("Azione") == 0) {
            penale = giorniritardo * 3;

        }
        if (tipo.compareTo("Commedia") == 0) {
            penale = giorniritardo * 2.50;

        }
        return penale;


    }
}