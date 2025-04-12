public class ProdutoAlimenticio {

    String nome;
    int anoValidade;
    String categoria;
    boolean perecivel;


    public void verificarValidade(int anoAtual){
        if(perecivel == true && anoValidade < anoAtual){
            System.out.println("Produto vencido!");
        } else if (perecivel == true && anoValidade >= anoAtual) {
            System.out.println("Produto dentro da validade.");
        }else {
            System.out.println("Produto não perecível, sem risco de vencimento.");
        }
    }
}
