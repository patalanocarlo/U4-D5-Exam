package Patalanocarlo.Archivio;
import java.util.ArrayList;
import java.util.List;




public class CatalogoBibliotecario {

    private List<ElementoCatalogo> catalogo;


    public CatalogoBibliotecario() {
        this.catalogo = new ArrayList<>();
    }
    public void aggiungiElemento(ElementoCatalogo elemento){
        catalogo.add(elemento);
    }
}