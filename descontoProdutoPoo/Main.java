import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto pEletronico = new Produto();

        System.out.println("Insira o nome do produto: ");
        pEletronico.nome = sc.nextLine();
        System.out.println("Insira a categoria dele");
        pEletronico.categoria = sc.nextLine();
        System.out.println("Insira o preco: ");
        pEletronico.preco = sc.nextDouble();

        System.out.println("Produto nome: " + pEletronico.nome);
        System.out.println("Categoria do produto: :" + pEletronico.categoria);
        System.out.println("Preço do produto: " + pEletronico.preco);
        pEletronico.desconto();

    }
}
