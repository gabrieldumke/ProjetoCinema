package projetocinema;

public class Filme {
    String nome;
    int idadeMin;

    public Filme(String nome, int idadeMin) {
        this.nome = nome;
        this.idadeMin = idadeMin;
    }

    public Filme(int idadeMin){
        setIdadeMin(idadeMin);
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    @Override
    public String toString() {
        return "Filme:1 " + this.nome + "\n" +
                "Classificacao: " + this.idadeMin;


    }
}
