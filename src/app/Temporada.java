package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numeroTemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();

    public Episodio getEpisodio(int nro) {

        // Recorre cada episodio si el numero de episodio del cicloes igual a "nro".
        // Devuelve episodio.

        for (Episodio epi : this.episodios) {
            if (epi.nroEpisodio == nro) {
                return epi;
            }
        }
        return null;

    }

    //Crear lista de websodio

}
