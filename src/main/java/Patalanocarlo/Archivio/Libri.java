package Patalanocarlo.Archivio;

public class Libri extends ElementoCatalogo{ //Estendo al figlio Il suo genitore cosi da poter passare gli elementi in comune ai libri
    private String autore; //Definisco gli attribuiti Specifici per i libri.
    private String genere;


    

    public Libri(String isbn, String Titolo, int annoPubblicazione, int numeroPagine, String autore, String genere){
        super(isbn,Titolo,annoPubblicazione,numeroPagine);  //Passo i valori del super del Padre.
        this.autore=autore; //Mi passo gli attributi del this dei valori del figlio.
        this.genere=genere;
    }


    //Getter e setter solo dei due attribuit specifici di libri.
    public String getAutore(){
        return autore;
    }
    public void setAutore(String autore){
        this.autore=autore;
    }
    public  String getGenere(){
        return genere;
    }
    public void  setGenere(String genere){
        this.genere=genere;
    }


    //To string finale per avere il return del libro annessi con il super.
    public String toString(){
        return  "Libro:{ " + "autore: " + autore + " " + "Genere: " + genere + " } "+ super.toString();
    }
}
