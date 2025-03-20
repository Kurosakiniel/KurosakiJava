public class Main {
    public static void main(String[] args) {

        LivroDeLivraria livro01 = new LivroDeLivraria();
        LivroDeLivraria livro02 = new LivroDeLivraria();

        livro01.nome = "Harry Potter e a Pedra Filosofal";
        livro02.nome = "Harry Potter e o Calice de fogo";

        livro01.genero = "Fantasia";
        livro02.genero = "Fantasia";

        livro01.ISBN = "a48487fsdfb";
        livro02.ISBN = "545484fsadfB";

        livro01.preco = 24.57;
        livro02.preco = 28.60;

        livro01.totalDePaginas = 300;
        livro02.totalDePaginas = 450;


        System.out.println("livro: " + livro01.nome + " Genero: "+ livro01.genero + "\n"
            + " ISBN:" + livro01.ISBN +  "\n" + " Preço: "  + livro01.preco + "\n" + " total de paginas: "
                + livro01.totalDePaginas);


        System.out.println("livro: " + livro02.nome + " Genero: "+ livro02.genero + "\n"
                + " ISBN:" + livro02.ISBN +  "\n" + " Preço: "  + livro02.preco + "\n" + " total de paginas: "
                + livro02.totalDePaginas);
    }
}
