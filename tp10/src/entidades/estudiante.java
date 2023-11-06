package entidades;

public class estudiante {
    //atributos
    private String nombre;
    private int edad;
    private String numIdentificacion;

    //constructor para inicializar los atributos
    public estudiante(String nombre, int edad,String numIdentificacion){
        this.nombre=nombre;
        this.edad=edad;
        this.numIdentificacion=numIdentificacion;
    }
    //metodos para acceder a los atributos (getters)
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getNumIdentificacion(){
        return numIdentificacion;
    }






}
