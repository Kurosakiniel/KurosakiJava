import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Veiculo veiculo01 = new Veiculo();

        System.out.println("Insira o tipo de veiculo: ");
        veiculo01.tipo = sc.nextLine();
        System.out.println("Insira o ano do veiculo: ");
        veiculo01.ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o modelo do veiculo: ");
        veiculo01.modelo = sc.nextLine();
        veiculo01.verificarRestricao();

    }
}
