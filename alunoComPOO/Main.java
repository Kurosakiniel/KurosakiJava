import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno01 = new Aluno();

        System.out.println("Digimte o nome do aluno: ");
        aluno01.nome = sc.nextLine();
        System.out.println("Digite a turma do aluno: ");
        aluno01.turma = sc.nextLine();
        System.out.println("Digite a nota final do aluno: ");
        aluno01.notaFinal = sc.nextDouble();

        System.out.println("Aluno: " + aluno01.nome);
        System.out.println("Turma:" + aluno01.turma);
        System.out.println("Nota final:" +aluno01.notaFinal);
        aluno01.verificarAprovado();

    }
}
