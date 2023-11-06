import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> numeros = new ArrayList<>();  //crear un array list

        //agregar numeros a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        //imprimir array list
        System.out.println("ArrayList de numeros enteros: " + numeros);

        //2
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Pia");
        nombres.add("venus");
        nombres.add("michi");

        System.out.println("ArryaList de nombres: " + nombres);

        //3
        // usando la arraylist de el punto uno
        System.out.println("metodo for-each");
        for (int i : numeros) {
            System.out.println(i);
        }

        //4
        //array de characteres
        ArrayList<Character> caracteres = new ArrayList<>();
        //agregar a la lista
        caracteres.add('A');
        caracteres.add('B');
        caracteres.add('C');
        caracteres.add('D');
        caracteres.add('E');

        //Encontrar la longitud del arraylist (numero de elementos)
        int longitud = caracteres.size();
        System.out.println("longitud del arrylist de caracteres: " + longitud);

        //5
        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("michi");
        cadena.add("casa");
        cadena.add("avion");
        cadena.add("esternon");
        cadena.remove(3); //para borrar de la cadena
        for (String i : cadena) {
            System.out.println(i);
        }

        //6
        ArrayList<Integer> vacio = new ArrayList<>();

        //preguntar si esta vacio
        if (vacio.isEmpty()) {
            System.out.println("el array esta vacio");
        } else {
            System.out.println("el array no esta vacio");
        }

        //7
        //usando el array de el punto uno
        int num_max = numeros.get(0);
        for (Integer i : numeros) {
            if (num_max < i) {
                num_max = i;
            }
        }
        System.out.println("El mayor numero del array list es: " + num_max);

        //8
        //array list punto uno

        ArrayList<Integer> copia = new ArrayList<>(); //crear un nuevo array para la copia

        copia.addAll(numeros); // usar el metodo addALL() para copiar los elementos

        copia.add(4);//modificar la copia (no afecta el array original

        //imprimir original
        System.out.println("array original: " + numeros);
        //imprimir copia
        System.out.println("copia: " + copia);

        //9
        //array del ejercicio 1
        Collections.reverse(numeros); //invierte el array
        for (Integer i : numeros) {
            System.out.println(i);
        }
        //10
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(3);
        num1.add(5);
        num1.add(7);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(2);
        num2.add(4);
        num2.add(6);
        num2.add(8);

        System.out.println("array uno: " + num1);
        System.out.println("array dos: " + num2);
        num1.addAll(num2);//unirlas

        System.out.println("unidos: " + num1);

        //11
        //array del ejercicio 1
        for (int i = 0; i < numeros.size(); i++) { //.size obtiene tamaño del array list
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        for (Integer i : numeros) {
            System.out.println(i);
        }

        //12
        ArrayList<String> cadena_dos = new ArrayList<>();
        cadena_dos.add("perro");
        cadena_dos.add("depto");
        cadena_dos.add("playa");
        cadena_dos.add("celular");

        System.out.println("la palabra 'depto' esta en el indice: " + cadena_dos.indexOf("depto")); //index0f para encontrar el indice

        //13
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array1.add(11);
        array1.add(23);
        array1.add(52);
        array1.add(49);

        array2.add(11);
        array2.add(23);
        array2.add(52);
        array2.add(49);

        int cont = 0;

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) == array2.get(i)) {
                cont++;
            }
        }
        if (cont == array1.size()) {
            System.out.println("Los array son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }
        //14
        //aray punto 10
        //Collections.min(numeros);  muestra el numero mas pequeño
        System.out.println(Collections.min(num1));

        //15
        ArrayList<Integer> suma = new ArrayList<>();

        suma.add(2);
        suma.add(2);
        suma.add(2);
        suma.add(2);

        int total = 0;
        for (int i : suma) {
            total += i;
        }

        System.out.println("la suma de el array list es de: " + total);

        //16
        ArrayList<String> concatenar = new ArrayList<>();

        concatenar.add("avion");
        concatenar.add("corazon");
        concatenar.add("gato");
        concatenar.add("notebook");

        String cadenaConcatenada = " ";

        for (String i : concatenar) {
            cadenaConcatenada += i;
        }
        System.out.println("la cadena concatenada es: " + cadenaConcatenada);

        //17

        ArrayList <Integer> array_17= new ArrayList<>();
        array_17.add(7);
        array_17.add(12);
        array_17.add(3);
        array_17.add(5);
        array_17.add(9);
        array_17.add(6);
        int sumar_ma=0;
        for (int i = 0; i < array_17.size(); i++) {
            sumar_ma+=array_17.get(i);
        }
        System.out.println("La suma de los elementos del array es: "+sumar_ma);

        //18
        ArrayList<Integer> sumar = new ArrayList<>();
        int Total = 0;

        sumar.add(4);
        sumar.add(2);
        sumar.add(6);
        sumar.add(7);
        sumar.add(2);

        for (int i = 0; i < sumar.size(); i++) {
            if (i % 2 == 0) {
                Total += sumar.get(i);
            }
        }
        System.out.println("el total de la suma de los indices es de: " + Total);

        //19
        int num=23;
        if (array_17.contains(num)){
            System.out.println("El array contiene el numero "+num);
        }else{
            System.out.println("El array no contiene el numero "+num);
        }

        //20
        ArrayList<String> cadenaMasLarga = new ArrayList<>();
        cadenaMasLarga.add("casa");
        cadenaMasLarga.add("perro");
        cadenaMasLarga.add("astronauta");
        String cadena_larga = "";
        for (String i : cadenaMasLarga) {
            if (i.length() > cadena_larga.length()) {
                cadena_larga = i;
            }
        }
        //21
        int suma_ocho=0;
        float promedio=0;
        for (int i = 0; i < array_17.size(); i++) {
            suma_ocho+=array_17.get(i);
        }
        promedio=suma_ocho/array_17.size();
        System.out.println("El promedio de los elementos del array es: "+promedio);

        //22
        ArrayList<Integer> arrayAscendente = new ArrayList<Integer>();

        arrayAscendente.add(4);
        arrayAscendente.add(6);
        arrayAscendente.add(8);
        arrayAscendente.add(3);
        arrayAscendente.add(3);

        Collections.sort(arrayAscendente);

        System.out.println("array en forma ascendente:"+arrayAscendente);

        //23
        int num_23=8;
        for (int i = 0; i < array_17.size(); i++) {
            if (array_17.get(i)>num_23){
                array_17.remove(array_17.get(i));
            }
        }
        for (Integer i : array_17) {
            System.out.println(i);
        }

        //24
        int num3=3;
        int contadorVeinti=0;

        for (int i:arrayAscendente) {
            if (num3==i){
                contadorVeinti++;
            }
        }
        System.out.println("el numero 3 se repite: "+contadorVeinti+" veces");


        //25
        ArrayList <String> array_25= new ArrayList<>();
        array_25.add("perro");
        array_25.add("michi");
        array_25.add("astonauta");
        array_25.add("pizza");
        array_25.add("italia");
        Collections.sort(array_25);
        for (String s: array_25) {
            System.out.println(s);
        }
















    }
}