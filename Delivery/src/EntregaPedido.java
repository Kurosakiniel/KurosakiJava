public class EntregaPedido implements EntregaService{

    @Override
    public void getTempoEstimado() {
        System.out.println("Tempo estimado de 30 minutos!");
    }

    @Override
    public void isPedidoUrgente() {
        System.out.println("Pedido urgente");
    }
}
