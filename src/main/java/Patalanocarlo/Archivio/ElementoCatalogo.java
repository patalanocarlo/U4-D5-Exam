package Patalanocarlo.Archivio;

import java.io.Serializable;

public  abstract class ElementoCatalogo implements Serializable  { //Creo una classe astratta al quale implemento Serializable.
    private String isbn;
    private String Titolo;                              //Successivamente passo tutti i suoi Attributi (La ho pensata come classe Padre)
    private int annoPubblicazione;
    private int numeroPagine;


    public ElementoCatalogo(String isbn,String Titolo, int annoPubblicazione, int numeroPagine){
        this.isbn=isbn;                                   //Faccio un this degli attribuiti passandoli prima come parametri e dopo li definisco:
        this.Titolo=Titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;
    }

//Getter e setter di ogni singolo attributo;


    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
       this.isbn=isbn;
    }
    public String getTitolo(){
        return Titolo;
    }
    public void  setTitolo(String Titolo){
        this.Titolo=Titolo;
    }
    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }
    public void setAnnoPubblicazione(int annoPubblicazione){
        this.annoPubblicazione=annoPubblicazione;
     }
    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }


    //In finale vado ad usare il ToString per comporre il return del elemento del catalogo con i relativi attribuiti passati.
    public String toString(){
        return " ElementoCatalogo{" + "isbn='" + isbn + " Titolo: " +Titolo + " AnnoPubblicazione: " +annoPubblicazione +" numeroPagine: " +numeroPagine + " }";
    }
}
