public class Veiculo {

    String modelo;
    int ano;
    String tipo;

    public void verificarRestricao(){
        if (tipo.equals("Moto") && ano < 2010){
            System.out.println("Veículo com restrição de circulação em dias úteis.");
            
        } else if (tipo.equals("caminhao") && ano < 2015) {
            System.out.println("Caminhão com restrição em áreas centrais");
        } else {
            System.out.println("Veículo liberado para a circulação.");
        }

    }
}
