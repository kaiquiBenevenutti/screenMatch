package models;

public class FiltraClassificacao {
    public void Filtra(Classificacao c){
        if(c.GetAvaliacao() >= 4){
             System.out.println("ASSISTA AGORA!");
        }else if(c.GetAvaliacao() >= 2){
             System.out.println("Assista quando conseguir.");
        }else{
             System.out.println("Nhé.");
        }
    }
}
