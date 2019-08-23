package app;

import java.util.ArrayList;
import java.util.List;

public class Series extends Contenido {
    public List<Temporada> temporadas = new ArrayList<Temporada>();

    public Temporada getTemporada (int nro)
    { 
        //Recorre cada temporada, si elnro de temp del ciclo es igual a "nro", devuelve Temporada

        for (Temporada tempo : this.temporadas){
            if(tempo.numeroTemporada==nro)
            {
                return tempo;
            }
        }

        return null;

    }

    
    
}