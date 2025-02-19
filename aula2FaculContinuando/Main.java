public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Conta c1 = new Conta();

        p1.nome = "Josias";
        c1.saldo = 300;

        c1.creditar(2000);

    }
}
