public class ContaCorrente extends Conta{

    public void sacar(double valor){
        super.saldo -= valor;

    }

    public void depositar(double valor){
        super.saldo += valor;

    }

    public void ExibirSaldo(){
        System.out.println(super.saldo);
    }

}
