import models.Classificacao;
import models.Filme;
import models.FiltraClassificacao;
import models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setDiretor("Arrascaeta");

        meuFilme.exibeFichaTecnica();

        Serie theBoys = new Serie();

        theBoys.setNome("The Boys");
        theBoys.setAtiva(true);
        theBoys.setTemporadas(4);
        theBoys.setAnoLancamento(2019);
        theBoys.setEpisodiosPorTemporada(8);
        theBoys.setMinutosPorEpisodio(60);
        theBoys.setAvaliacao(9.3);

        var nome = theBoys.getNome();
        var anoLancamento = theBoys.getAnoLancamento();
        var tempo = theBoys.getDuracaoEmMinutos();
        System.out.println(nome + " uma serie que lançou em " + anoLancamento + " que possui a incrivel nota de " + theBoys.getAvaliacao() + " e demora " + tempo +" minutos para maratonar.");

        FiltraClassificacao f = new FiltraClassificacao();

        f.Filtra(theBoys);
    }
}