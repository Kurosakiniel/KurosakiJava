import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome de Usuário: ");
        String usuario = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Nivel de acesso: " + "\n" + "1: usuário comum" + "\n" + "2: Administrador");
            int pergunta = sc.nextInt();
            if (pergunta == 1) {
                System.out.println("Bem vindo, usuário!");
            } else if (pergunta == 2) {
                System.out.println("Seja bem vindo, administrador!");
            }else {
                System.out.println("Nível de acesso inválido.");
            }
        }else {
            System.out.println("Acesso negado");
        }


    }

}
