package entidades;

public class libro {
    //atributos
    String titulo;
    String autor;
    int AnioDePublicacion;

    public libro (String titulo,String autor,int AnioDePublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.AnioDePublicacion=AnioDePublicacion;
    }
    public void informacion(){
        System.out.println("Titulo del libro: "+titulo);
        System.out.println("Autor del libro: "+autor);
        System.out.println("Año de publicacion: "+AnioDePublicacion);

    }
}
