package entidades;

public class pelicula {
    String titulo;
    String director;
    int duracion;

    public pelicula(String titulo, String director, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }
    public void informacion(){
        System.out.println("el titulo de la pelicula es: "+titulo);
        System.out.println("el director: "+director);
        System.out.println("duracion: "+duracion);
    }
}
