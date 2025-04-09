import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / altura;

        if (imc <= 18.5){
            System.out.println("Abaixo do peso!");
        } else if (imc <= 25) {
            System.out.println("Peso normal!");
        } else if (imc <= 29.9) {
            System.out.println("Sobre Peso!");
        } else {
            System.out.println("Obesidade!");
        }
    }
}
