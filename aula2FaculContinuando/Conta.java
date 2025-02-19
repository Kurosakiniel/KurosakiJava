public class Conta {

    double saldo;

    void debitar(double valor){
        System.out.println("Seu saldo atual agora é: " + (saldo - valor));
    }

    void creditar(double valor){
        System.out.println("Seu saldo atual agora é: " + (saldo + valor));
    }

}
