public class Main {
    public static void main(String[] args) {

        Lampada lampada01 = new Lampada();
        
        lampada01.modelo = "Pendente Julieta";
        lampada01.cor = "Cobre";
        lampada01.tipo = "4 lampadas E27";
        lampada01.voltagem = 127;

        lampada01.ligarLampada();
        lampada01.desligarLampada();

    }
}
