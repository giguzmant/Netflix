package app;

public class Episodio {

    public int nroEpisodio;
    public String titulo;
    public int duracion;

    public Episodio (String tit){
        this.titulo = tit;
    }

    public Episodio(){
        
    }

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.nroEpisodio + "" + this.titulo);

        
    }
}