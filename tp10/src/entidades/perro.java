package entidades;
//definir clase perro
public class perro {
    //atributos de la clase perro
    String nombre;
    int edad;
    String raza;

    //constructor de la clase perro
    public perro(String nombre, int edad, String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;

    }

    public void informacion() {
        System.out.println("Nombre del perro: " + nombre);
        System.out.println("Edad del perro: " + edad + " años");
        System.out.println("Raza del perro: " + raza);
    }
    public void ladrar(){
        System.out.println("Guau, Guau");
    }


}
