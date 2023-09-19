// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner leer = new Scanner(System.in);
        /* 1 */
        System.out.print("ingrese el primer numero");
        int number = leer.nextInt();
        System.out.print("ingrese el segundo numero");
        int numberone = leer.nextInt();
                                                    System.out.print("los numeros son: "+number+","+numberone);

        System.out.println();

        /* 2 */
        System.out.print("ingrse un nombre: ");
        String name =leer.nextLine();
        System.out.print("el nombre es: "+name);

        /* 3 */
        System.out.print("ingrese un numero: ");
        int numberthree =leer.nextInt();
        System.out.print("el doble del numero "+numberthree+"es: "+numberthree*2+ "y el triple es: "+numberthree*3);

        /* 4 */
        System.out.print("ingrese los grados: ");
        int grado = leer.nextInt();
        System.out.print("c° "+grado+"pasado a fahrenheit es: "+ (32 + ( 9 * grado / 5)) );

        /* 5 */

        System.out.print("ingrese el valor del radio: ");
        double radio = leer.nextDouble();
        System.out.print("longitud " + (2*3.14*radio) + " el valor de area: "+ (3.14* Math.pow(radio,2)));


        /* 6 */
        System.out.print("ingrese una velocidad en km para pasarla a m/s");
        double km = leer.nextDouble();
        System.out.print("Su velocidad en m/s es: "+km/3.6);


        /* 7 */
        System.out.println("ingrese un cateto de su triangulo: ");
        double catetouno = leer.nextDouble();
        System.out.println("ingrese el segundo cateto: ");
        double catetodos = leer.nextDouble();
        double resultado = Math.sqrt((Math.pow(2, catetouno)+Math.pow(2, catetodos)));
        System.out.println("el resultado es: "+resultado);

        /* 8 */
        System.out.println("ingrese el radio de una esfera: ");
        double radios= leer.nextDouble();
        double volumen = ((4.0/3)*Math.PI*Math.pow(radios,3));
        System.out.println("el volumen de la esfera es de "+volumen);

        /* 9 */

        System.out.println("ingrese el lado 1: ");
        double lado_uno = leer.nextDouble();
        System.out.println("ingrese el lado 2: ");
        double lado_dos = leer.nextDouble();
        System.out.println("ingrese el lado 3: ");
        double lado_tres = leer.nextDouble();
        double p =(lado_uno+lado_dos+lado_tres)/2 ;
        double area= Math.sqrt(p*(p-lado_uno)*(p-lado_dos)*(p-lado_tres));

        System.out.println("el area es: "+area);

        /* 10 */
        System.out.println("ingrese un numero de 3 cifras");
        int numbers = leer.nextInt();
        int n_uno = numbers/100;  /*muestra el primer numero*/
        System.out.println(n_uno);
        int n_dos = (numbers%100)/10; /*muestra el segundo numero*/
        System.out.println(n_dos);
        double n_tres = (numbers%10); /*muestra el tercer numero*/
        System.out.println(n_tres);


        /* 11 */

        System.out.print("Ingrese un número entero de 5 cifras: ");
        int n = leer.nextInt();
        leer.close();

        if (n >= 10000 && n <= 99999) {
            String nStr = String.valueOf(n);
            for (int i = 1; i <= 5; i++) {
                System.out.println(nStr.substring(0, i) + " ");
            }
        } else {
            System.out.println("El número ingresado no tiene 5 cifras.");
        }

        /* 12 */
        System.out.println("ingrese un numero de 5 cifras: ");
        int n_one = leer.nextInt();
        leer.close();

        if (n_one >= 10000 && n_one <= 99999){
            String n_oneStr =String.valueOf(n_one);
            for (int i = 1; i <= 5; i++){
                System.out.println(n_oneStr.substring(5-i,5)+" ");
            }
        }else{
            System.out.println("el numero ingresado no tiene 5 cifras");
        }

        /* 13 */
        System.out.println("ingrese su fecha de nacimiento separada por comas mm,dd,aaaa");
        String nacimiento =leer.next();

        String[] partesSeparadas = nacimiento.split(",");
        String parte_uno = partesSeparadas[0];
        String parte_dos = partesSeparadas[1];
        String parte_tres = partesSeparadas[2];
        int parte_unont=Integer.parseInt(parte_uno);
        int parte_dosnt=Integer.parseInt(parte_dos);
        int parte_tresnt=Integer.parseInt(parte_tres);
        int resultados=(parte_unont+parte_dosnt+parte_tresnt);
        System.out.println( parte_uno+"+"+parte_dos+"+"+parte_tres+"="+resultado);

        int cifra1=(resultados/1000);
        int cifra2=(resultados/100%10);
        int cifra3=(resultados/10%10);
        int cifra4=(resultados%10);

        System.out.println(cifra1+cifra2+cifra3+cifra4);

        /* 14 */

        System.out.println("ingrese el precio por unidad del producto: ");
        double producto =leer.nextInt();
        System.out.println("ingrese cuantos productos vendio: ");
        double productos_vendidos =leer.nextInt();
        System.out.println("cual es el porcentaje de IVA aplicado: ");
        double iva= leer.nextInt();

        double iva_precio= (iva/100);  /*el iva se divide por 100 asi nos da el numero con ","*/
        double precio_deliva= (iva_precio*producto);  /*se multiplica el iva con , con el producto para obtener el iva*/
        double precio_final= (precio_deliva+producto); /*se suma el iva con el producto*/
        double unidad=(precio_final/productos_vendidos);  /*se divide el precio que obtuvimos por las unidad que vendimos para saber el precio final*/

        System.out.println("precio por unidad con IVA incluido"+unidad);

        /* 15 */

        System.out.println("ingrese la variable de numeros n(varios digitos): ");
        int nd= leer.nextInt();
        System.out.println("ingrese la variable de numeros m (se le va a quitar esta cantidad de numeros al num anterior): ");
        int m= leer.nextInt();

        nd=nd /(int)Math.pow(10,m);
        System.out.println("valor nuevo: "+nd);


        /* 16 */
        System.out.println("ingrese la temperatura en grados centigrados: ");
        double centigrados= leer.nextInt();
        double reamur=(80*centigrados/100);
        double kelvin= (centigrados+273);
        System.out.println("grados reamur: "+reamur+" grados kelvin: "+kelvin);


    }

}