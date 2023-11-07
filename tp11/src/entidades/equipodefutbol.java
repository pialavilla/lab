package entidades;
import java.util.ArrayList;
import java.util.Scanner;
public class equipodefutbol {
    private ArrayList<String> jugadores;

    public equipodefutbol() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
        System.out.println("Jugador agregado: " + jugador);
    }

    public void eliminarJugador(String jugador) {
        if (jugadores.contains(jugador)) {
            jugadores.remove(jugador);
            System.out.println("Jugador eliminado: " + jugador);
        } else {
            System.out.println("El jugador no se encuentra en la lista");
        }
    }

    public void listarPlantilla() {
        System.out.println("Plantilla del equipo:");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}

