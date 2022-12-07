package it.unisa.Noleggio;

public class Commedia extends Film {
    public int numgiorni;
    public Commedia(String nome , String codice , int numgiorni)
    {
        super(nome, codice);
        this.numgiorni=numgiorni;
    }
    public double calcoloPenaleRitardo(int numgiorni)
    {
        double penale;
        penale = numgiorni * 2.50;
         return penale;
    }

    @Override public String toString(){
        String stringa = this.nome + this.codice +  this.numgiorni;
        return stringa;
    }

    @Override public Commedia clone()
    {
        Commedia tizio;
        try{
            tizio = (Commedia) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new Error();
        }
        return tizio;
    }

}
