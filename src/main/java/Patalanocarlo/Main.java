package Patalanocarlo;

import Patalanocarlo.Archivio.CatalogoBibliotecario;
import Patalanocarlo.Archivio.Libri;
import Patalanocarlo.Archivio.Rivista;

public class Main {
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo= new CatalogoBibliotecario();
        Libri libro_1= new Libri("23553"," Il signore Degli Anelli",1949,1500,"TOLKIEN","Fantasy");
        Libri libro_2=new Libri("348893","Macchine Mortali", 2012,1230,"Philip Reeve","SteamPunk");
        Rivista rivista1 = new Rivista("0987654321", "National Geographic", 2021, 100, Rivista.Periodicità.MENSILE);

  catalogo.aggiungiElemento(libro_1);
  catalogo.aggiungiElemento(libro_2);
  catalogo.aggiungiElemento(rivista1);











    }

}
