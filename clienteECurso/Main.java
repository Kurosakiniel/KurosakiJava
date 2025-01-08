public class Main {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();
        Curso curso = new Curso();

        cliente01.nome = "Jorge";
        cliente01.renda = 2350;
        cliente01.idade = 23;

        curso.nomeCurso = "Analise e Desenvolvimento";
        curso.Valor = 640;
        curso.Duracao = 2;

        System.out.println("Aluno: " + cliente01.nome);
        System.out.println("Curso: " + curso.nomeCurso);
        System.out.println("Valor do Curso: " + curso.Valor);
        System.out.println("Duração do curso: " + curso.Duracao);

        }
    }