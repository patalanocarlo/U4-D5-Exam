package Patalanocarlo;

import Patalanocarlo.Archivio.CatalogoBibliotecario;
import Patalanocarlo.Archivio.ElementoCatalogo;
import Patalanocarlo.Archivio.Libri;
import Patalanocarlo.Archivio.Rivista;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
        Libri libro_1 = new Libri("23553", " Il signore Degli Anelli", 1949, 1500, "TOLKIEN", "Fantasy");
        Libri libro_2 = new Libri("348893", "Macchine Mortali", 2012, 1230, "Philip Reeve", "SteamPunk");
        Rivista rivista1 = new Rivista("0987654321", "National Geographic", 2021, 100, Rivista.Periodicità.MENSILE);


        //Aggiunta di un elemento:
        catalogo.aggiungiElemento(libro_1);
        catalogo.aggiungiElemento(libro_2);
        catalogo.aggiungiElemento(rivista1);
        System.out.println("Ecco l'aggiunta di tutto il catalogo:");
      catalogo.catalogo.forEach(System.out::println);

      //Aggiungo un ulteriore controllo che se è vuoto mi stampa un messaggio di eccezzione.
        if (catalogo.catalogo.isEmpty()) {
            System.out.println("Non c'è nulla da aggiungere al catalogo.");
        } else {
            System.out.println("Ecco l'aggiunta di tutto il catalogo:");
            catalogo.catalogo.forEach(System.out::println);
        }




        // Ricerca per ISBN:
        System.out.println("Ecco la ricerca Per ISBN:");
        Optional<ElementoCatalogo> risultatoIsbn = catalogo.RicercaIsbn("23553");
        if (risultatoIsbn.isPresent()) {
            System.out.println(risultatoIsbn.get());
        } else {
            System.out.println("Mi dispiace, non esiste questo ISBN nel catalogo.");
        }

// Ricerca per anno di pubblicazione:
        System.out.println("Ricerca per anno di pubblicazione:");
        List<ElementoCatalogo> risultatiAnno = catalogo.ricercaPerAnnoPubblicazione(2012);
        if (!risultatiAnno.isEmpty()) {
            risultatiAnno.forEach(System.out::println);
        } else {
            System.out.println("Mi dispiace, non ci sono elementi nel catalogo pubblicati nell'anno specificato.");
        }

       try {
            catalogo.salvaCatalogoSopraIlDisco("C:\\Users\\patal\\OneDrive\\Desktop\\Java Model\\U4-D5-Exam\\src\\main\\catalogo.json");
            System.out.println("Archivio salvato su disco con successo.");
        } catch (IOException e) {
            System.err.println("Si è verificato un errore durante il salvataggio dell'archivio su disco:");
            e.printStackTrace();
        }

// Caricamento dal disco dell'archivio in una nuova lista
        CatalogoBibliotecario nuovoCatalogo = new CatalogoBibliotecario();
        try {
            nuovoCatalogo.caricaCatalogoDaDisco("C:\\Users\\patal\\OneDrive\\Desktop\\Java Model\\U4-D5-Exam\\src\\main\\catalogo.json");
            System.out.println("Archivio caricato da disco con successo.");
        } catch (IOException e) {
            System.err.println("Si è verificato un errore durante il caricamento dell'archivio da disco:");
            e.printStackTrace();
        }

// Stampare il catalogo caricato da disco
        System.out.println("Catalogo caricato da disco:");
        nuovoCatalogo.catalogo.forEach(System.out::println);



//Inizio rimozione di un elmeneto dal catalogo in base al isbn:
        Optional<ElementoCatalogo> elementoDaRimuovere = catalogo.RicercaIsbn("348893");
        elementoDaRimuovere.ifPresentOrElse(
                elemento -> {
                    System.out.println("Elemento da rimuovere:");
                    System.out.println(elemento);
                },
                () -> System.out.println("Elemento non trovato")
        );

         // Rimozione di un elemento
        catalogo.RimuoviElemento("348893");


        System.out.println("Catalogo dopo la rimozione:");
        catalogo.catalogo.forEach(System.out::println);

    }
}
