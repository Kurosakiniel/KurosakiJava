public class Aluno {

    String nome;
    String turma;
    double notaFinal;

    public void verificarAprovado(){
        if (notaFinal >= 7){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
