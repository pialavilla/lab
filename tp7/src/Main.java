// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*1*/
        int[] numeros = {6, 7, 5, 3, 2, 9};
        Arrays.sort(numeros);
        System.out.println("array ordenado de menor a mayor: ");
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
        /*2*/
        Integer[] numero_tres = {6, 7, 5, 3, 2, 9};
        Arrays.sort(numero_tres, Collections.reverseOrder());
        System.out.println("array ordenado de menor a mayor: ");
        for (int ordenar : numero_tres) {
            System.out.println(ordenar + " ");
        }
        /*3*/
        float[] numero = {7.39f, 6.35f, 26.05f, 9.45f};
        Arrays.sort(numero);
        System.out.println("array ordenado de menor a mayor: ");
        for (float ordenado : numero) {
            System.out.println(ordenado + " ");
        }
        /*4*/
        System.out.println("Ejercicio 4(ordenar un array de numeros flotantes de mayor a menor)");
        Float [] numeros4={7.39f,6.35f,26.05f,9.45f};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros4));
        Arrays.sort(numeros4, new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o2, o1); // Compara en orden descendente
            }
        });
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros4));

        /*5*/
        String[] array_5 = {"diciembre", "enero", "agosto", "abril", "noviembre"};
        Arrays.sort(array_5);
        for (String string : array_5) {
            System.out.println(string);
        }
        /*6*/
        String[] array_6 = {"diciembre", "enero", "agosto", "abril", "noviembre"};
        Arrays.sort(array_6, Collections.reverseOrder());
        for (String string : array_6) {
            System.out.println(string);
        }

    /*12*/

        int[] arrayInser = new int[10];
        int[] arraySelec = new int[10];

        for (int i = 0; i < arraySelec.length; i++) {
            System.out.println("Ingrese el numero en el casillero " + i);
            arraySelec[i] = leer.nextInt();
        }
        ordenarArraySeleccion(arraySelec);
        System.out.println("Array Ordenado por Seleccion");
        for (int i : arraySelec) {
            System.out.println("[ " + i + " ]");
        }
        for (int i = 0; i < arrayInser.length; i++) {
            System.out.println("Ingrese el numero en el casillero " + i);
            arrayInser[i] = leer.nextInt();
        }
        ordenarArrayInsercion(arrayInser);
        System.out.println("Array Ordenado por Insercion");
        for (int i : arrayInser) {
            System.out.println("[ " + i + " ]");
        }

    }
    /*termina el main*/
        public static void ordenarArrayInsercion ( int[] array){
            Arrays.sort(array);
        }

    public static void ordenarArraySeleccion(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}







