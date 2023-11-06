package entidades;

public class rectangulo {
    private double ancho;
    private double alto;

    public rectangulo(double ancho,double alto){
        this.ancho=ancho;
        this.alto=alto;
    }
    //area del rectangulo metodo
    public double calcularArea(){
        return ancho*alto;
    }
    //perimetro del rectangulo
    public double calculaPerimetro(){
        return 2*(ancho+alto);
    }







}
