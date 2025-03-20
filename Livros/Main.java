public class Main {
    public static void main(String[] args) {

        Livro livro01 = new Livro();
        Livro livro02 = new Livro();

        livro01.nome = "Harry Potter e a Pedra Filosofal";
        livro02.nome = "Harry Potter e o Calice de fogo";

        livro01.genero = "Fantasia";
        livro02.genero = "Fantasia";


        System.out.println("livro: " + livro01.nome + " Genero: "+ livro01.genero);
        System.out.println("livro: " + livro02.nome + " Genero: "+ livro02.genero);


    }
}
