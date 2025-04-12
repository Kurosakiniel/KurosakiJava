import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livro01 = new Livro();
        Livro livro02 = new Livro();

        System.out.println("Qual livro você deseja?");
        livro01.titulo = sc.nextLine();
        System.out.println("Qual autor?");
        livro01.autor = sc.nextLine();
        livro01.emprestado = true;

        System.out.println("Qual outro livro você deseja?");
        livro02.titulo = sc.nextLine();
        System.out.println("Qual autor?");
        livro02.autor = sc.nextLine();
        livro02.emprestado = false;

        System.out.println(livro01.titulo);
        livro01.verificarDisponibilidade();

        System.out.println(livro02.titulo);
        livro02.verificarDisponibilidade();
    }
}
