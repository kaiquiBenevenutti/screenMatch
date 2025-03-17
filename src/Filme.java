public class Filme {
    String nome;
    int anoLancamento;
    boolean incluiNoPlano;
    double avaliacao;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Tempo do filme: " + duracaoEmMinutos + " minutos");
    }
}
