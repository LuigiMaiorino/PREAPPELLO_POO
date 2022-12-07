package it.unisa.Noleggio;
import java.util.Comparator;
import java.util.Objects;

public class Azione extends Film  {
  public   int num_giorni;

    public Azione(int num_giorni , String codice , String nome){
        super(codice , nome);
            this.num_giorni=num_giorni;


    }
    public double calcolaPenaleRitardo(int num_giorni)
    {
        double penale;
            penale= this.num_giorni * 3;
        return penale;
    }

    @Override  public String toString(){
        String stringa = this.nome + this.codice + this.num_giorni;
        return stringa;
    }

    @Override  public boolean equals(Objects obj) {
        if (this == obj) {
            return true;}
         if(!(obj instanceof Azione)){
            return false;
        }
    }


    @Override public Azione clone ()
    {
        Azione tizio;
        try{
            tizio = (Azione) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new Error();
        }
        return tizio;
    }
}