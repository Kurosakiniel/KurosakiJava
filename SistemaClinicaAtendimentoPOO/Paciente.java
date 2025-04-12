public class Paciente {

    String nome;
    int idade;
    boolean convenio;

    public void verificarPrioridade(){
        if (idade >= 60){
            System.out.println("Atendimento prioritário");
        } else {
            System.out.println("Atendimento comum");
        }
    }

}
