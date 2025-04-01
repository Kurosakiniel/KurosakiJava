abstract class Pedido {

    protected int id;
    protected String cliente;
    protected double valor;
    protected String status;

    public abstract void CalculoTaxa();

    public abstract void getDetalhes();

    public double getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
