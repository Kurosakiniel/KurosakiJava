public class Livro {

    String titulo;
    String autor;
    boolean emprestado;

    public void verificarDisponibilidade(){
        if (emprestado == false){
            System.out.println("Livro disponível para empréstimo");
        }else{
            System.out.println("Livro ja emrprestado");
        }
    }
}
