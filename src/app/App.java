package app;

public class App {
    public static void main(String[] args) throws Exception {
       
       
        System.out.println("Iniciando Catalogo...");
       
        Netflix.InicializarCatalogo();

        Series flea = Netflix.BuscarSeries("Fleabag");

        Temporada laMejorTemporada = flea.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

    }
}