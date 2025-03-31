public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();

        c1.depositar(500);
        c1.sacar(300);
        c1.ExibirSaldo();
    }
}
