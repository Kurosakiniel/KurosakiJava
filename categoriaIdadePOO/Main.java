import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador jogador01 = new Jogador();

        System.out.println("Insira o nome do Jogador: ");
        jogador01.nome = sc.nextLine();

        System.out.println("Insira a idade do jogador");
        jogador01.idade = sc.nextInt();

        System.out.println("Insira a modalidade do jogador");
        jogador01.modalidade = sc.nextLine();
        sc.nextLine();

        Jogador jogador02 = new Jogador();

        System.out.println("Insira o nome do Jogador: ");
        jogador02.nome = sc.nextLine();

        System.out.println("Insira a idade do jogador");
        jogador02.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira a modalidade do jogador");
        jogador02.modalidade = sc.nextLine();


        System.out.println("Nome do Jogador" + "\n" + jogador01.nome + "idade:" + jogador01.idade + "\n" +
                "modadlidade" + jogador01.modalidade);
        jogador01.classificarCategoria();

        System.out.println("Nome do Jogador" + "\n" + jogador02.nome + "idade:" + jogador02.idade + "\n" +
                "modadlidade" + jogador02.modalidade);
        jogador02.classificarCategoria();

    }
}
