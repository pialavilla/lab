package entidades;
public class cuentaBancaria {
    private double saldo;
    private String numeroDeCuenta;
    //constructor para incializar atributos
    public cuentaBancaria(String numeroDeCuenta){
        this.numeroDeCuenta=numeroDeCuenta;
        this.saldo=0.0; //inicializar la cuenta en 0
    }
    //metodo para depositar dinero en la cuenta
    public void depositar(double cantidad){
        if (cantidad>0){
            saldo+=cantidad;
            System.out.println("deposito exitodo. Nuevo saldo: "+ saldo);
        }else {
            System.out.println("el monto del deposito debe ser mayor que cero.");
        }
    }
    //retirar dinero
    public void retirar(double cantidad){
        if(cantidad>0 && cantidad<=saldo){
            saldo-=cantidad;
            System.out.println("retiro exitoso. Nuevo saldo: "+saldo);
        }else{
            System.out.println("saldo insuficiente");
        }
    }
    //obtener saldo actual
    public double obtenerSaldo(){
        return saldo;
    }








}
