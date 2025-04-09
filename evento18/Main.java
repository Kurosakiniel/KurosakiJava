import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = sc.nextInt();

        if (idade <  18){
            System.out.println("Você não pode entrar no evento!");
        }else {
            System.out.println("Pode entrar!");
        }

    }
}
