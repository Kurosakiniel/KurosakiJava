public class Jogador {

    String nome;
    int idade;
    String modalidade;

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", modalidade='" + modalidade + '\'' +
                '}';
    }

    public void classificarCategoria(){
        if(idade >= 6 && idade <= 12){
            System.out.println("Infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade > 18 && idade <= 35) {
            System.out.println("Adulto");
        } else if (idade > 35) {
            System.out.println("Veterano");
        } else {
            System.out.println("Idade invalida para participação");
        }



    }
}
