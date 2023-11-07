// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //1
        int []numeros={6,5,4,7,};
        Arrays.sort(numeros);
        System.out.println("numeros ordenados de menor a mayor:");
        for (int i:numeros){
            System.out.println(i+" ");
        }

        //2
        Integer []numeros_dos={6,7,4,5};
        Arrays.sort(numeros_dos, Collections.reverseOrder());
        System.out.println("numeros ordenados de mayor a menor:");
        for (int n:numeros_dos){
            System.out.println(n);
        }

        //3
        float []numeros_tres={5.4f,4.5f,9.5f};
        Arrays.sort(numeros_tres);
        System.out.println("numeros flotantes ordenados de menor a mayor");
        for (float i:numeros_tres){
            System.out.println(i);
        }

        //4
        Float[]numeros_cuatro={5.4f,7.6f,9.8f};
        //definir un comparador de ordenar may a men
        Comparator<Float> comparator=new Comparator<Float>() {
            @Override
            public int compare(Float a, Float b) {
                //ordenar de mayor a menor
                return Float.compare(b,a);
            }
        };
        //ordenar el array en forma descendente usando el comparador
        Arrays.sort(numeros_cuatro,comparator);
        System.out.println("array ordenado de mayor a menor: "+Arrays.toString(numeros_cuatro));

        //5
        String[] palabras={"arbol","casa","taza","bebe"};
        Arrays.sort(palabras);
        System.out.println("palabras ordenadas alfabeticamente: ");
        for (String i:palabras){
            System.out.println(i);
        }
        //6
        String[] palabras_dos={"arbol","casa","taza","bebe"};
        Arrays.sort(palabras_dos,Comparator.reverseOrder());
        System.out.println("nombres ordenados al inverso");
        for (String i:palabras_dos){
            System.out.println(i);
        }
        //7 y 8 no se hacen
        //9 burbuja
        int[] numeros_cinco= {5,4,2,6,7,8};
        ordenamientoBurbuja(numeros_cinco);
        System.out.println("Array ordenado en orden ascendente por ordenamineto burbuja:");
        for (int n:numeros_cinco){
            System.out.println(n);
        }

        //10 seleccion seleccion
        int[] numeros_seis={5,4,2,6,7,8};
        ordenamientoSeleccion(numeros_seis);
        System.out.println("array ordenado en orden ascendente por ordenamineto por seleccion:");
        for (int n:numeros){
            System.out.println(n);
        }

        //11 ordenamiento inserccion
        int[] numeros_siete={5,2,9,1,5,6};
        ordenamientoIntersercion(numeros_siete);
        System.out.println("Array ordenado en orden ascendente por ordenamineto por interseccion:");
        for (int n:numeros_siete){
            System.out.println(n);
        }

        //12 ordenamineto por mezcla
        int[] numeros_ocho={1,6,2,3,4,10,7,9};
        ordenamientoPorMezcla(numeros_ocho);
        System.out.println("Array ordenado en orden ascendente por ordenamiento por mezcla:");
        for (int n:numeros_ocho){
            System.out.println(n);
        }

        //13 ordenamineto shell
        int[] numeros_nueve={1,4,5,7,8,3};
        ordenamientoShell(numeros_nueve);
        System.out.println("array ordenado en orden ascendente por ordenamiento Shell:");
        for(int n:numeros_nueve){
            System.out.println(n);
        }


    }




    //9 ordenamineto burbuja fuera del main descendente
    public static void ordenamientoBurbuja(int[] arr) {
        int n= arr.length;

        for (int i=0; i<n-1; i++ ){
            for (int j=0; j<n-1 -i; j++){
                if (arr[j]> arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //10 ordenamineto por seccion fuera del main
    public static void ordenamientoSeleccion(int[] arr){
        int n=arr.length;
        for (int i=0; i<n -1; i++){
            int indiceMinimo=i;
            //encontrar el indice minimo en el subarray no ordenado
            for (int j=i + 1; j<n; j++){
                if (arr[j] < arr[indiceMinimo]){
                    indiceMinimo=j;
                }
            }
            //intercambiar el elemento minimo con el primer elemento del subarray
            int temp= arr[i];
            arr[i]=arr[indiceMinimo];
            arr[indiceMinimo]=temp;
        }

    }
    //11 ordenamineto por insercion
    public static void ordenamientoIntersercion(int[] arr){
        int n= arr.length;

        for (int i=1; i<n; i++){
            int clave= arr[i];
            int j=i-1;

            //mover los elemntos mayores q la clave a la derecha
            while (j>=0 && arr[j]>clave){
                arr[j+1]=arr[j];
                j--;
            }
        }
    }
    //12 ordenamineto por mezcla
    public static void ordenamientoPorMezcla(int[] arr){
        int n= arr.length;

        if(n<=1){
            return;
        }
        //dividir el array en dos mitades
        int mitad=n/2;
        int[] izquierda=new int[mitad];
        int[] derecha= new int[n-mitad];

        for (int i=0; i<mitad ;i++){
            izquierda[i]=arr[i];
        }
        for (int i=mitad; i<n; i++){
            derecha[i-mitad]=arr[i];
        }
        //lamada recursiva para ordenar mitades
        ordenamientoPorMezcla(izquierda);
        ordenamientoPorMezcla(derecha);
        //combinar las mitades ordenadas
        int i=0, j=0, k=0;
        while (i< izquierda.length && j< derecha.length){
            if (izquierda[i]<derecha[i]){
                arr[k]=izquierda[i];
                i++;
            }else{
                arr[k]=derecha[j];
                j++;
            }
            k++;
        }
        while (i< izquierda.length){
            arr[k]=izquierda[i];
            i++;
            k++;
        }
        while (j< derecha.length){
            arr[k]=derecha[j];
            j++;
            k++;
        }
    }
    //13 ordenamiento shell
    public static void ordenamientoShell(int[] arr){
        int n= arr.length;
        //determinar el tamaño del intervalo (gap)
        int gap=1;
        while (gap<n/3){
            gap=gap*3+1;
        }
        while (gap>0){
            for(int i=gap; i<n; i++){
                int temp=arr[i];
                int j=i;
                while (j>=gap && arr[j-gap]>temp){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
            gap=(gap-1)/3;
        }
    }


}














