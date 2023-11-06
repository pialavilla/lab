import entidades.circulo;
import entidades.perro;
import entidades.estudiante;
import entidades.libro;
import entidades.cuentaBancaria;
import entidades.rectangulo;
import entidades.coche;
import entidades.pelicula;
public class Main {
    public static void main(String[] args) {

        //1
        //crear un objeto de la clase perro y asignar valores a sus atributos
        perro miPerro=new perro("Fido",3,"labrador");
        //llamar al metodo para imprimir la informacion del perro
        miPerro.informacion();
        miPerro.ladrar();

        //2
        //crear un objeto de la clase circulo con un radio de 5.0 unidades
        circulo miCirculo =new circulo(5.0);
        //calcular y mostrar el area del circulo
        double area = miCirculo.calcularArea();
        System.out.println("el area del circulo es: "+area);
        //calcular y mostrar el area del circulo
        double circunsferencia=miCirculo.calcularCircunsferencia();
        System.out.println("la circunserencia del circulo es: "+circunsferencia);

        //3
        //crear un objeto de la clase estudiante e inicializar sus atributos
        estudiante estudiante = new estudiante ("pia lavilla",18,"123456789");

        //acceder a los atributos del estudiante y mostrarlos
        System.out.println("nombre del estudiante: "+estudiante.getNombre());
        System.out.println("edad del estudiante: "+estudiante.getEdad()+" años");
        System.out.println("numero de identificacion: "+estudiante.getNumIdentificacion());

        //4
        libro miLibro=new libro("Un verano sin ti","pia lavilla",2023);
        miLibro.informacion();

        //5
        //objeto de clase cuenta bancaria
        cuentaBancaria cuenta = new cuentaBancaria("123456789");

        //realizar deposito
        cuenta.depositar(1000.0);
        cuenta.retirar(500.0);
        //Obtener saldo actual
        double saldoActual=cuenta.obtenerSaldo();
        System.out.println("saldo actual: "+saldoActual);

        //6
        //objeto con ancho y alto
        rectangulo rectangulo=new rectangulo(4.0,6.0);

        //Calcular y mostrar el area del rectangulo
        double Area= rectangulo.calcularArea();
        System.out.println("area del rectangulo: "+Area);

        //calcular y mostrar perimtro
        double perimetro = rectangulo.calculaPerimetro();
        System.out.println("perimetro del rectangulo: "+perimetro);

        //7
        coche Coche = new coche("Audi", "Camry", 2022,0);
        //acelerar
        Coche.acelerar(50);
        //frenar
        Coche.frenar(20);

        //8
        pelicula miPelicula = new pelicula("un verano", "pia lavilla",103);
        miPelicula.informacion();











    }
}