package models;

public class Filme {
    private  String nome;
    private int anoLancamento;
    private boolean incluiNoPlano;
    private double avaliacao;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoLancamento(int ano){
        this.anoLancamento = ano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
        this.totalAvaliacoes++;
    }

    public boolean isIncluiNoPlano() {
        return incluiNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Tempo do filme: " + duracaoEmMinutos + " minutos");
    }
}
