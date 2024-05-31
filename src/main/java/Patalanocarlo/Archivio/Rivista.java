package Patalanocarlo.Archivio;
public class Rivista extends ElementoCatalogo {  //Estendo a Rivista il suo Padre


    public enum Periodicità   { //creo una sottoclasse periodicità per le settimane e i mesi.
        SETTIMANALE, MENSILE, SEMESTRALE
    }
    private Periodicità periodicità;

    public Rivista(String isbn, String Titolo, int annoPubblicazione, int numeroPagine) { //Mi passo i parametri del padre e faccio il super.
        super(isbn, Titolo, annoPubblicazione, numeroPagine);
        this.periodicità=periodicità;
    }


    //Getter e setter del unico attributo di Rivista
    public Periodicità getPeriodicita(){
        return periodicità;
    }

    public void setPeriodicita(Periodicità periodicita) {
        this.periodicità = periodicita;
    }

    //ToString finale con il return della Stringa per la rivista.
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicità +
                "} " + super.toString();
    }

}
