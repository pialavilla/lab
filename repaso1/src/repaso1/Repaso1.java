/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso1;
import java.util.Scanner;
public class Repaso1 {
    public static void main(String[] args) {
        Scanner corre= new Scanner(System.in);
        
        int pizza;
         
          while (true){
          System.out.println("las opciones de pizza son: ");
          System.out.println("1-Muzarella");
          System.out.println("2-Capresse");
          System.out.println("3-Napolitana");
          System.out.println("4-Hawaiana");
          System.out.println("5-Cuatro quesos");
          System.out.println("ingrese el numero de la pizza que desea: ");
          pizza=corre.nextInt();
          
          switch(pizza){
              case 1:
                  System.out.println("A elegido la pizza Muzarella debe pagar $500");
                  break;
              case 2:
                  System.out.println("A elegido la pizza Capresse debe pagar $550");
                  break;
              case 3:
                  System.out.println("A elegido la pizza Napolitana debe pagar $600");
                  break;
              case 4:
                  System.out.println("A elegido la pizza Hawaiana debe pagar $650");
                  break;
              case 5:
                  System.out.println("A elegido la pizza Cuatro Quesos debe pagar $750");
                  break;
              default:
                  continue;
                }
          break;
        }
    } 
}
