import java.util.ArrayList;
import java.util.Scanner;
import entidades.equipodefutbol;
import entidades.factura;
import entidades.articulo;

public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<String> marcas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("ingrese una marca o 'fin' para salir");
            String salida = leer.nextLine();

            if (salida.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("añade una marca al array");
            marcas.add(salida);
        }
        System.out.println("las marcas guardadas son: ");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        //2
        equipodefutbol equipo = new equipodefutbol();
        equipo.agregarJugador("Jugador1");
        equipo.agregarJugador("Jugador2");
        equipo.listarPlantilla();
        equipo.eliminarJugador("Jugador2");
        equipo.listarPlantilla();

        //3

        factura factura = new factura(1, "2023-11-07", "Cliente");
        factura.agregarArticulo("carne", 324.5, 2);
        factura.agregarArticulo("papas", 25.5, 12);
        factura.agregarArticulo("jugo", 136.99, 1);
        factura.calcularSubtotal();
        factura.calcularIVA();
        factura.calcularTotal();
        factura.mostrar();
    }
        }

