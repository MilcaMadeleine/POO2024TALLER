import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private int idCliente;
        private String nombre;
        private String direccion;
        private String telefono;
        private String correo;
        private int edad;
        private List<String> historialPedidos; // Para almacenar el historial de pedidos
        public Cliente(int idCliente, String nombre, String direccion, String telefono, String correo, int edad) {
            this.idCliente = idCliente;
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
            this.edad = edad;
            this.historialPedidos = new ArrayList<>();
        }
        public void agregarPedido(String pedido) {
            historialPedidos.add(pedido);
            System.out.println("Pedido agregado: " + pedido);
        }
        public void eliminarPedido(String pedido) {
            if(historialPedidos.remove(pedido)) {
                System.out.println("Pedido eliminado: " + pedido);
            } else {
                System.out.println("Pedido no encontrado: " + pedido);
            }
        }
        public void actualizarPedido(String pedidoAntiguo, String pedidoNuevo) {
            int index = historialPedidos.indexOf(pedidoAntiguo);
            if(index != -1) {
                historialPedidos.set(index, pedidoNuevo);
                System.out.println("Pedido actualizado de: " + pedidoAntiguo + " a: " + pedidoNuevo);
            } else {
                System.out.println("Pedido no encontrado: " + pedidoAntiguo);
            }
        }
        public void verHistorial() {
            System.out.println("Historial de pedidos:");
            for(String pedido : historialPedidos) {
                System.out.println(pedido);
            }
        }
        public int getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public List<String> getHistorialPedidos() {
            return historialPedidos;
        }
    }
