package app;

import java.util.ArrayList;
import java.util.List;

public class Netflix {

    public static List <Peliculas> catalogPeliculas = new ArrayList<Peliculas>();
    public static List <Series> catalogSeries = new ArrayList<Series>();

    public static Series BuscarSeries(String nombre){
        for (Series s : Netflix.catalogSeries){
            if (s.nombre.equals(nombre))
                return s;
        }
        return null;
    }

    public static Peliculas BuscarPeliculas(String nombre){
        for (Peliculas p: Netflix.catalogPeliculas){
            if (p.nombre.equals(nombre))
                return p;
        }
        return null;
    }

    /** public static void LimpiarCatalogo(){
     * 
     *  Netflix.CatalogoPeliculas.clear();
     *  Netflix.CatalogoSeries.clear();
     * } */

     public static void InicializarCatalogo()
     {
         Netflix.AgregarFleabag();
     }

     public static void AgregarFleabag()
     {
         Series fleab = new Series();
         fleab.nombre = "Fleabag";
         fleab.año = 2017;
         fleab.genero = "Dramedy";

         Temporada t1= new Temporada();
         t1.numeroTemporada = 1;

         Episodio ep = new Episodio("Episode 1");

         ep.nroEpisodio = 1;

         ep.duracion = 34;

         t1.episodios.add(ep);

        /**
         * Como la variable ya esta declarada se vuelve a utilizar, en este caso es ep
         */

         ep = new Episodio("Episode 2");

         ep.nroEpisodio = 2;
         ep.duracion = 40;

         t1.episodios.add(ep);

         ep = new Episodio("Episode 3");

         ep.nroEpisodio = 3;
         ep.duracion = 40;

         t1.episodios.add(ep);


         ep = new Episodio("Episode 4");

         ep.nroEpisodio = 4;
         ep.duracion = 40;
         t1.episodios.add(ep);


         ep = new Episodio("Episode 5");

         ep.nroEpisodio = 5;
         ep.duracion = 40;

         t1.episodios.add(ep);


         fleab.temporadas.add(t1);

         Temporada t2= new Temporada();
         t2.numeroTemporada = 2;

         Websodio ep1 = new Websodio("Australia");

         ep1.nroEpisodio = 1;
         ep1.duracion = 4;

         t2.episodios.add(ep1);


         ep1 = new Websodio("Black Keys");
         ep1.nroEpisodio = 2;
         ep1.duracion = 4;
         t2.episodios.add(ep1);
        

         ep1 = new Websodio("Black Keys");
         ep1.nroEpisodio = 2;
         ep1.duracion = 4;


         t2.episodios.add(ep1);

         ep1 = new Websodio("Predictable");
         ep1.nroEpisodio = 3;
         ep1.duracion = 4;
 

         t2.episodios.add(ep1);


         fleab.temporadas.add(t2);







         Netflix.catalogSeries.add(fleab);

     }



    





}
