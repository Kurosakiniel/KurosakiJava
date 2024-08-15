// usando import Scanner para ler as variavies

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        // declaranto tipo de variavel

        int A;
        int B;

        // vai ler primeiro o A depois o B

        A = ler.nextInt();
        B = ler.nextInt();

        // Variavel para soma

        int soma = (A + B);

        // Soma como um todo

        System.out.println(soma);

    }

}