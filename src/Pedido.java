import java.util.Date;

public class Pedido {
        private int idPedido;
        private Date fecha;
        private double total;
        private String estado;
        public Pedido(int idPedido, Date fecha, double total, String estado) {
            this.idPedido = idPedido;
            this.fecha = fecha;
            this.total = total;
            this.estado = estado;
        }
        public void solicitar() {
            this.estado = "Solicitado";
            System.out.println("El pedido ha sido solicitado.");
        }
        public void cancelarPedido() {
            if (!this.estado.equals("Cancelado")) {
                this.estado = "Cancelado";
                System.out.println("El pedido ha sido cancelado.");
            } else {
                System.out.println("El pedido ya está cancelado.");
            }
        }
        public double calcularTotal() {
            return this.total;
        }
        public void cambiarEstado(String nuevoEstado) {
            this.estado = nuevoEstado;
            System.out.println("El estado del pedido ha sido cambiado a: " + nuevoEstado);
        }
        public int getIdPedido() {
            return idPedido;
        }

        public void setIdPedido(int idPedido) {
            this.idPedido = idPedido;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }
