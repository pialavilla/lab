package entidades;
public class coche {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int velocidad=0 ;

    public coche(String marca, String modelo,int anioFabricacion, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.anioFabricacion=anioFabricacion;
    }
    public void acelerar (int IncrementoVelocidad) {
        if (IncrementoVelocidad > 0) {
            velocidad += IncrementoVelocidad;
            System.out.println("el coche a acelerado a " + velocidad + "km/h");
        }
    }
    //metodo frenar
    public void frenar (int decrementoVelocidad){
        if (decrementoVelocidad>0 && velocidad - decrementoVelocidad>=0){
            velocidad-= decrementoVelocidad;
            System.out.println("el coche ha frenado "+ velocidad+ "km/h");
        }
    }

}
