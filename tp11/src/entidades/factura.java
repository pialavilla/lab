package entidades;
import entidades.articulo;
import java.util.ArrayList;
public class factura {

    private int numeroFactura;
    private String fechaEmision;
    private String cliente;
    private ArrayList<String> articulos;
    private ArrayList<Double> preciosUnitarios;
    private ArrayList<Integer> cantidades;
    private double subtotal;
    private double iva;
    private double total;

    public factura() {
    }

    public factura(int numeroFactura, String fechaEmision, String cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.preciosUnitarios = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.subtotal = 0.0;
        this.iva = 0.0;
        this.total = 0.0;
    }

    public void agregarArticulo(String articulo, double precioUnitario, int cantidad) {
        articulos.add(articulo);
        preciosUnitarios.add(precioUnitario);
        cantidades.add(cantidad);
    }

    public double calcularSubtotal() {
        subtotal = 0.0;
        for (int i = 0; i < articulos.size(); i++) {
            double precioUnitario = preciosUnitarios.get(i);
            int cantidad = cantidades.get(i);
            subtotal += precioUnitario * cantidad;
        }
        return subtotal;
    }

    public double calcularIVA() {
        iva = calcularSubtotal() * 0.16;
        return iva;
    }

    public double calcularTotal() {
        total = calcularSubtotal() + calcularIVA();
        return total;
    }
    public void mostrar(){
        System.out.println("Numero de factura: "+numeroFactura);
        System.out.println("Fecha: "+fechaEmision);
        System.out.println("Cliente: "+cliente);
        for (String a: articulos) {
            System.out.println(a);
        }
        System.out.println("Total: "+total);
    }
}


