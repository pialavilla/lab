package entidades;
public class circulo {

    //atributos para el radio del circulo
    private double radio;

    //constructor para incializar el radio
    public circulo (double radio){
       this.radio=radio;
    }
    //metodo para calcular el area del circulo
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
    //metodo para calcular la cirunsferencia del circulo
    public double calcularCircunsferencia(){
        return 2* Math.PI * radio;
    }






}
