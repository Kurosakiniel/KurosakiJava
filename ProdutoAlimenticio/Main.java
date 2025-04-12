import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProdutoAlimenticio p1 = new ProdutoAlimenticio();

        System.out.println("Nome do produto: ");
        p1.nome = sc.nextLine();
        p1.perecivel = false;
        System.out.println("Categoria: ");
        p1.categoria = sc.nextLine();
        System.out.println("Ano de Validade: ");
        p1.anoValidade = sc.nextInt();
        sc.nextLine();

        ProdutoAlimenticio p2 = new ProdutoAlimenticio();
        System.out.println("Nome do produto: ");
        p2.nome = sc.nextLine();
        p2.perecivel = true;
        System.out.println("Categoria do produto: ");
        p2.categoria = sc.nextLine();
        System.out.println("Ano de validade: ");
        p2.anoValidade = sc.nextInt();

        System.out.println("Produdo" + p1.nome + "\n" + "ano de validade: "+ p1.anoValidade + "Categoria: "
                + p1.categoria + "\n" +"Perecovel" + p1.perecivel);
        p1.verificarValidade(2025);

        System.out.println("Produdo" + p2.nome + "\n" + "ano de validade: "+ p2.anoValidade + "Categoria: "
                + p2.categoria + "\n" +"Perecovel" + p2.perecivel);
        p2.verificarValidade(2025);
    }
}
