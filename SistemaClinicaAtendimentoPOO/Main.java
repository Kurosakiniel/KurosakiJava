import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Paciente p1 = new Paciente();
        System.out.println("Nome do paciente: ");
        p1.nome = sc.nextLine();
        System.out.println("Idade do paciente: ");
        p1.idade = sc.nextInt();
        System.out.println("Possui convenio?");
        p1.convenio = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Qual o tipo da sua consulta?");
        System.out.println("[1] Clínica Geral" + "\n" + "[2] Pediatria" + "\n" + "[3] Ortopedia");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println(p1.nome);
                System.out.println(p1.idade);
                if(p1.convenio){
                    System.out.println("Consulta agendada com desconto de convênio");
                }else {
                    System.out.println("Consulta agendada com valor integral");
                }
                p1.verificarPrioridade();
                break;
            case 2:
                System.out.println(p1.nome);
                System.out.println(p1.idade);
                if(p1.convenio){
                    System.out.println("Consulta agendada com desconto de convênio");
                }else {
                    System.out.println("Consulta agendada com valor integral");
                }
                p1.verificarPrioridade();
                break;
            case 3:
                System.out.println(p1.nome);
                System.out.println(p1.idade);
                if(p1.convenio){
                    System.out.println("Consulta agendada com desconto de convênio");
                }else {
                    System.out.println("Consulta agendada com valor integral");
                }
                p1.verificarPrioridade();
                break;
            default:
                System.out.println("Tipo de consulta inválida!");
        }
    }
}