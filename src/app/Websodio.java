package app;

public class Websodio extends Episodio{

    

    public Websodio(String tit){
        super (tit); // Superclase 
    }

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.nroEpisodio + "" + this.titulo);

    }



    
}