import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Escolha;

        do {

            System.out.println("Insira a operação desejada");
            String operador = sc.next();

            System.out.println("Insira o primeiro valor:");
            int num1 = sc.nextInt();

            System.out.println("Insira o segundo valor:");
            int num2 = sc.nextInt();

            switch (operador) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Isso não é uma operação");
            }

                System.out.println("Deseja fazer outra operação?");
                System.out.println("Sim = 1");
                System.out.println("Não = 2");

                Escolha = sc.nextInt();


        } while (Escolha == 1);

    }
}