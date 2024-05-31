package Patalanocarlo.Archivio;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;


public class CatalogoBibliotecario {

   public List<ElementoCatalogo> catalogo;


    public CatalogoBibliotecario() {
        this.catalogo = new ArrayList<>();
    }

    //Metodo per andare ad aggiungere un elemento
    public void aggiungiElemento(ElementoCatalogo elemento){
        catalogo.add(elemento);
    }

    //Metodo di rimozioni isbn dato il suo stesso isbn
    public void RimuoviElemento(String isbn){
        catalogo.removeIf(e -> e.getIsbn().equals(isbn));
    }

    //Ricerca per Un valore chiave isbn
    public Optional<ElementoCatalogo> RicercaIsbn(String isbn){
        return catalogo.stream().filter(e -> e.getIsbn().equals(isbn)).findFirst();
    }
    //Ricerca per l'anno di pubblicazione
    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
        return catalogo.stream().filter(e -> e.getAnnoPubblicazione() == anno).collect(Collectors.toList());
    }

    //Qui vado a ricercare l'autore in base al filtro e al libro preso vado a fare una get sul autore
    public  List<ElementoCatalogo> RicercaPerAutore(String autore){
        return catalogo.stream()
                .filter(e -> e instanceof Libri && ((Libri) e).getAutore().equalsIgnoreCase(autore))
                .collect(Collectors.toList());
    }
    public void salvaCatalogoSopraIlDisco(String file) throws IOException{
        ObjectMapper objectMapper= new ObjectMapper();
        ElementoCatalogo[] elementi = objectMapper.readValue(new File(file), ElementoCatalogo[].class);
        catalogo = new ArrayList<>(List.of(elementi));
    }
    public void caricaCatalogoDaDisco(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ElementoCatalogo[] elementi = objectMapper.readValue(new File(filePath), ElementoCatalogo[].class);
        catalogo = new ArrayList<>(List.of(elementi));
    }
}