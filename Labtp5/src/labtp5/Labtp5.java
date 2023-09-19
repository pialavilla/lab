/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtp5;
import java.util.Scanner;
public class Labtp5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in); 
        /* 1 */
        System.out.println("ingrese un numero: ");
        int numerouno = leer.nextInt();
        if (numerouno % 2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        
        /* 2 */
        System.out.println("ingrese un numero: ");
        int numerodos= leer.nextInt();
        if (numerodos % 10 == 0){
            System.out.println("es multiplo de 10");
        }else{
            System.out.println("no es multiplo de 10");
        }
        
        /* 3 */
        System.out.println("ingrese una letra: ");
        char letra= leer.next().charAt(0);
        if (Character.isUpperCase(letra)){
            System.out.println("es una letra mayuscula");
        }else{
            System.out.println("no es una letra mayuscula");
        }
        
        /*4*/
        System.out.println("ingrese un numero entero: ");
        int numerotres= leer.nextInt();
        System.out.println("ingrese otro numero entero: ");
        int numerocuatro= leer.nextInt();
        if (numerotres==numerocuatro){
            System.out.println("los numeros son iguales");
        }else{
            System.out.println("los numeros no son iguales");
        }
        
        /* 5 */
        System.out.println("ingrese un numero: ");
        int numberone = leer.nextInt();
        System.out.println("ingrese otro numero: ");
        int numbertwo = leer.nextInt ();
        if (numberone == numbertwo ){
            System.out.println("los numeros son iguales ");
        }else if (numberone > numbertwo ){
            System.out.println("el numero "+numberone+" es mayor");
        }else if (numbertwo > numberone){
            System.out.println("el numero "+numbertwo+" es mayor");
        }
        
        /* 6 */
        System.out.println("ingrese un numero: ");
        int num_1 =leer.nextInt();
        System.out.println("ingrese otro numero: ");
        int num_2 =leer.nextInt();
        double num_3= num_1%10;
        double num3= num_2%10;
        if (num_3==num3){
        System.out.println("los numeros son iguales");
        }else{
            System.out.println("los numeros no son iguales");
        }
        
        /* 7 */
        System.out.println("ingrese un numero entero: ");
        int num_mult =leer.nextInt();
        if (num_mult % 3==0 && num_mult % 5==0 ){
        System.out.println("el numero es multiplo de 3 y de 5");
        }else{
            System.out.println("el numero no es multiplo de 3 y de 5");
        }
        /* 8 */
        
        System.out.println("ingrese un numero: ");
        int num_one =leer.nextInt();
        if (num_one % 2==0 || num_one % 3==0 ){
            System.out.println("el numero es multiplo de 2 o de 3 ");
        }else{
            System.out.println("el numero no es multiplo ni de 2 ni de 3");
        }
        /* 9 */
        System.out.println("ingrese un caracter: ");
        String caracter= leer.next();
        System.out.println("ingrese otro caracter: ");
        String caracter1= leer.next();
            if (caracter.equals(caracter1)){
                System.out.println("los caracteres son iguales");
            }else{
                System.out.println("los caracteres son distintos");
            }

        /* 10 */
        System.out.println("ingrese una letra ");
        String letra_one= leer.next();
        System.out.println("ingrese otra letras ");
        String letra2= leer.next();
        if (letra_one.toLowerCase() == null ? letra2.toLowerCase() == null : letra_one.toLowerCase().equals(letra2.toLowerCase()) ){
            System.out.println("ambas letras son minusculas");
        }else{
            System.out.println("una o ninguna de las letras es minsucula");
        }
        
        /* 11 */ 
        System.out.println("ingrese un caracter para adivinar si es num o letra");
        String character= leer.next();
        int[] array={0,1,2,3,4,5,6,7,8,9};
        for (int i : array){
            if (character.equals(String.valueOf(i))){
            System.out.println("es numero");
            }else{
                System.out.println("no es numero");
            }
        }
        
        
       
        /* 12 */
        System.out.println("ingrese un numero: ");
        int n_1= leer.nextInt();
        System.out.println("ingrese otro numero: ");
        int n_2= leer.nextInt();
        if (n_1 == 0 || n_2 == 0 ){
            System.out.println("no se puede dividir por 0");
        }else{
            System.out.println(n_1/n_2);
        }
        
        /* 13 */
        System.out.println("ingrese un año para saber si es bisiesto o no: ");
        int anio = leer.nextInt();
        if (anio %4==0 && anio%100==0 || anio %400==0 ){
            System.out.println("el año ingresado es bisiesto");
        }else{
                System.out.println("el año ingresado no es bisisesto");
                }
        
        /* 14 */
        System.out.println("ingrese un numero de 3 cifras: ");
        int tres_c =leer.nextInt();
        int aux= tres_c;
        String tres_s= String.valueOf(tres_c);
        if (tres_s.length()>3){
            System.out.println("el numero ingresado tiene mas de 3 cifras ");
        }else{
            int uno= aux / 100;
            System.out.println(uno);
            int dos= aux % 10 ;
            System.out.println(dos);
                if (uno==dos){
                    System.out.println("el numero es capicua");
                }else{
                    System.out.println("el numero no es capicua");
                }
        }
        
        /* 15 */
        
        System.out.println("ingrese la hora: ");
        int hora= leer.nextInt();
        System.out.println("ingrese los minutos: ");
        int minutos= leer.nextInt();
        System.out.println("ingrese los segundos: ");
        int seg= leer.nextInt();
        if (hora>=0 && hora<=24 || minutos>=0 && minutos<=60 || seg>=0 && seg<=60 ){
            System.out.println("a ingresado una hora valida: "+hora+":"+minutos+":"+seg);
        }
              
        
        
    }
}
