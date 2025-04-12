import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que deseja converter seu metro?");
        System.out.println("1: Centímetros;" + "\n" + "2: Milímetros;" + "\n" + "3: Quilômetros" +
                "\n" + "4: Polegadas");

        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Quantos metros deseja converter em Centimetros?");
                double metros = sc.nextDouble();
                System.out.println("Total de polegadas: " + (metros * 100));
                break;

            case 2:
                System.out.println("Quantos metros deseja converter em Milímetros;");
                metros = sc.nextDouble();
                System.out.println("Total de milímetros: " + (metros / 0.0010000));
                break;

            case 3:
                System.out.println("");
                metros = sc.nextDouble();
                System.out.println("Total de Quilometros: " + (metros * 1000));
                break;

            case 4:
                System.out.println("Quantos metros deseja converter em polegadas?");
                metros = sc.nextDouble();
                System.out.println("Total de polegadas: " + (metros * 39.37));
                break;

            default:
                System.out.println("Invalido");
        }
    }
}