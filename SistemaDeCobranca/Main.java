import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo! Qual tipo de serviço deseja escolher? ");
        System.out.println("[1]: Intenert - R$ 2.00 por GB" + "\n" + "[2] Ligação - R$ 0.50 por minuto"
                + "\n" + "[3] SMS - R$ 0.10 por mensagem" + "\n" + "[4] Streaming - R$ 5.00 por hora");

        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Para pagar a internet, digite a quantidade de GB usado: ");
                double qntdUsado = sc.nextDouble();
                System.out.println("Valor a pagar: R$" + (qntdUsado * 2));
                break;
            case 2:
                System.out.println("Para pagar o serviço de ligação você deve dizer o total de minutos usados: ");
                qntdUsado = sc.nextDouble();
                System.out.println("Valor a pagar: R$" + qntdUsado * 0.50);
                break;
            case 3:
                System.out.println("Para pagar o serviço de SMS, você deve dizer o total de mensagens: ");
                qntdUsado = sc.nextDouble();
                System.out.println("Valor a pagar: R$" + qntdUsado * 0.10);
                break;
            case 4:
                System.out.println("Para pagar o serviço de streaming você deve informar a quantidade de horas: ");
                qntdUsado = sc.nextDouble();
                System.out.println("Valor a pagar: R$" + qntdUsado * 5);
                break;
            default:
                System.out.println("Serviço inválido!");
        }
    }
}
