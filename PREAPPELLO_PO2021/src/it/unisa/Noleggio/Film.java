package it.unisa.Noleggio;



public  class Film {
    public String codice;
    public String nome;
    public Film(String codice , String nome) {
        this.codice=codice;
        this.nome = nome;

    }
    public String getNome()
    {
        return this.nome;

    }
    public String getCodice()
    {
         return this.codice;
    }

}
