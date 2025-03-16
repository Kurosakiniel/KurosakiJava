public class Main {
    public static void main(String[] args) {

        Lanchonete lanchonete01 = new Lanchonete();
        Lanchonete lanchonete02 = new Lanchonete();

        lanchonete01.tipoDaBebida = "Não alcoolicas";
        lanchonete01.tipoDoLanche = "Salgados";
        lanchonete01.nome = "Lanchonete Pedro Henrique";

        lanchonete02.tipoDoLanche = "Marmitas e Salgados";
        lanchonete02.tipoDaBebida = "Sucos e refrigerantes";
        lanchonete02.nome = "Marimba";

        System.out.println("Lanchonete 01: " + "\n" + "Nome:"  + lanchonete01.nome  + "\n" + "Tipo de lanche: " +
         lanchonete01.tipoDoLanche + "\n" + "Tipo de bebida: " + lanchonete01.tipoDaBebida + "\n");

        System.out.println("Lanchonete 02: " + "\n" + "Nome:"  + lanchonete02.nome  + "\n" + "Tipo de lanche: " +
                lanchonete02.tipoDoLanche + "\n" + "Tipo de bebida: " + lanchonete02.tipoDaBebida + "\n");
    }
}