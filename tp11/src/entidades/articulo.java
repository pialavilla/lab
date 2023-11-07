package entidades;
import entidades.factura;
public class articulo {
    // Clase Articulo.java
    public class Articulo {
        private String nombre;
        private double precioUnitario;
        private int cantidad;

        public Articulo(String nombre, double precioUnitario, int cantidad) {
            this.nombre = nombre;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getprecioUnitario() {
            return precioUnitario;
        }

        public int getcantidad() {
            return cantidad;
        }
    }


}
