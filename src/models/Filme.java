package models;

public class Filme extends Titulos implements Classificacao {
    private String diretor;

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int GetAvaliacao() {
        return (int) getAvaliacao() / 2;
    }
}
