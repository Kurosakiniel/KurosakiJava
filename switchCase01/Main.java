import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1: Soma" + "\n" + "2: Subtração" + "\n" + "3: Divisão" + "\n" + "4: Multiplicação");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Insira o valor do primeiro número: ");
                double n1 = sc.nextDouble();
                System.out.println("Insira o valor do segundo número: ");
                double n2 = sc.nextDouble();
                System.out.println("Resultado: " + (n1 + n2));

                break;
            case 2:
                System.out.println("Insira o valor do primeiro número: ");
                n1 = sc.nextDouble();
                System.out.println("Insira o valor do segundo número: ");
                n2 = sc.nextDouble();
                System.out.println("Resultado: " + (n1 - n2));

                break;
            case 3:
                System.out.println("Insira o valor do primeiro número: ");
                n1 = sc.nextDouble();
                System.out.println("Insira o valor do segundo número: ");
                n2 = sc.nextDouble();
                System.out.println("Resultado: " + (n1 / n2));

                break;
            case 4:
                System.out.println("Insira o valor do primeiro número: ");
                n1 = sc.nextDouble();
                System.out.println("Insira o valor do segundo número: ");
                n2 = sc.nextDouble();
                System.out.println("Resultado: " + (n1 * n2));

                break;
            default:
                System.out.println("Operação invalida!");
        }
    }
}
