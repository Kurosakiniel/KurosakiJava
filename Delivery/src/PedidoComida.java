public class PedidoComida extends Pedido{

    @Override
    public void CalculoTaxa() {
        double taxa = 5.0;
        double valor = super.valor;
        this.valor += taxa;
    }

    @Override
    public void getDetalhes() {

    }
}
