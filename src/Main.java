import java.util.Date;
public class Main {
    public static void main(String[] args) {

                Cliente cliente1 = new Cliente(1, "Juan Perez", "Calle Falsa 123", "555-1234", "juan@example.com", 30);
                Pedido pedido1 = new Pedido(101, new Date(), 150.0, "Pendiente");
                cliente1.agregarPedido("Pedido 101");
                cliente1.verHistorial();
                pedido1.solicitar();
                System.out.println("Estado del pedido: " + pedido1.getEstado());
                pedido1.cancelarPedido();
                System.out.println("Estado del pedido: " + pedido1.getEstado());
                double total = pedido1.calcularTotal();
                System.out.println("Total del pedido: " + total);
                pedido1.cambiarEstado("Enviado");
                System.out.println("Estado del pedido: " + pedido1.getEstado());
                cliente1.eliminarPedido("Pedido 101");
                cliente1.verHistorial();
                cliente1.agregarPedido("Pedido 102");
                cliente1.actualizarPedido("Pedido 102", "Pedido 103");
                cliente1.verHistorial();
            }
        }