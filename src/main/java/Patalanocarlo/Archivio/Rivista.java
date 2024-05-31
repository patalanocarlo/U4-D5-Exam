package Patalanocarlo.Archivio;
public class Rivista extends ElementoCatalogo {


    public enum Periodicità   {
        SETTIMANALE, MENSILE, SEMESTRALE
    }
    private Periodicità periodicità;

    public Rivista(String isbn, String Titolo, int annoPubblicazione, int numeroPagine) {
        super(isbn, Titolo, annoPubblicazione, numeroPagine);
        this.periodicità=periodicità;
    }
    public Periodicità getPeriodicita(){
        return periodicità;
    }

    public void setPeriodicita(Periodicità periodicita) {
        this.periodicità = periodicita;
    }
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicità +
                "} " + super.toString();
    }

}
