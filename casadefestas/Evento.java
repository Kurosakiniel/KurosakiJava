public class Evento implements Organizavel{

    private TipoEvento tipoDeEvento;
    public static int numeroParticipantes = 0;


    @Override
    public void organizarevento() {

    }

    public void realizarevento(){

    }

    public void calcularCustoDoEvento(int valorPorParticipante, int dinheiroPorHoras, int servicosAdicionais, int contador){

        // Para cara participante do evento deve ter um preco de 150 reais para entrada
        // Cada uma hora é equivalente a 120 reais no estabelicimento dependendo do tipo de
        // Evento
        // Serviços adicionais

        if (tipoDeEvento == TipoEvento.CASAMENTO){

            valorPorParticipante = 50;
            dinheiroPorHoras = 150;
            servicosAdicionais = 500;
            contador = 0;

            while (contador < 0) {
                System.out.println('Deseja realizar um evento?');
            }

        } else if (tipoDeEvento == TipoEvento.FORMATURA) {

        }

    }

}
