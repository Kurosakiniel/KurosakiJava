public class Produto {

    String nome;
    double preco;
    String categoria;

    public void desconto(){
        if(categoria.equals("eletronico")){
            double desconto = preco - ( 0.10 * preco);
            System.out.println("Total a pagar com desconto inserido: " + desconto);
        } 
        else if (categoria.equals("livro")) {
            double desconto = preco - ( 0.20 * preco);
            System.out.println("Total a pagar com desconto inserido: " + desconto);
        } else if (categoria.equals("roupa")) {
            double desconto = preco - ( 0.10 * preco);
            System.out.println("Total a pagar com desconto inserido: " + desconto);
        } else {
            System.out.println("Não qualificado para desconto, total do produto: " + preco);
        }
    }
}
