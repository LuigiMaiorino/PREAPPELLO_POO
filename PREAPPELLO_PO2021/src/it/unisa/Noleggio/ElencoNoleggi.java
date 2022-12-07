package it.unisa.Noleggio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ElencoNoleggi extends Noleggio{
    ArrayList<Noleggio> archivio = new ArrayList<>();
    public ElencoNoleggi(String nome, String codice , int giorniritardo ,int id,ArrayList<Noleggio> archivio){
        super(nome,codice,giorniritardo,id);
        this.archivio=archivio;
    }
    public void aggiungiNoleggio(Noleggio n)
    {
        archivio.add(n);
            System.out.println("nuovo noleggio aggiunto");
    }
    public double calcolaPenaliRitardo(){
      int tot_ritardi=0;
        for(int i=0;i<archivio.size();i++)
        {
            tot_ritardi+=archivio.get(i).giorniritardo;
        }
        return  tot_ritardi;
    }

    public ArrayList<Noleggio> cerca(String t)
    {
        ArrayList<Noleggio> nuovo = new ArrayList<>();
        for(int i=0;i<archivio.size();i++)
        {
            if(t.compareTo(archivio.get(i).nome)==0)
            {
                nuovo.add(archivio.get(i));
            }
        }
        return nuovo;
    }
}
