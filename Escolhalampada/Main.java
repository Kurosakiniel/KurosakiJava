import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lampada lampada01 = new Lampada();
        Lampada lampada02 = new Lampada();

        lampada01.tipoDeLampada = "Lampada Amarela";
        lampada02.tipoDeLampada = "Lampada Vermelha";

        System.out.println("Qual lampada você deseja comprar?");

        System.out.println("Lampada 01: " + lampada01.tipoDeLampada +"\n" +"Lampada 02: " +
                lampada02.tipoDeLampada);

        int escolha = sc.nextInt();


        switch (escolha){
            case 1:
                System.out.println(lampada01.tipoDeLampada + " Está a venda!");
            break;
            case 2:
                System.out.println(lampada02.tipoDeLampada + " Não está a venda!");
        }

        }
    }
