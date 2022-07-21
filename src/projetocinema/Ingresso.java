package projetocinema;

public class Ingresso {
    Sessao sessao;
    Pessoa pessoa;
    String poltrona;

    public Ingresso(Sessao sessao, Pessoa pessoa, String poltrona){
        setSessao(sessao);
        setPessoa(pessoa);
        setPoltrona(poltrona);

    }
    public void setPessoa(Pessoa pessoa){
        if (pessoa != null && pessoa.computarIdade("20/04/2022") >= this.sessao.filme.idadeMin ) {
            this.pessoa = pessoa;
        } else {
            System.out.println("Pessoa é nulo ou sua idade é menor que a classificação do filme.");
            System.exit(0);
        }
    }
    public void setSessao(Sessao sessao){
        if (sessao != null) {
            this.sessao = sessao;
        } else {
            System.out.println("Sessao é nulo!");
            System.exit(0);
        }
    }
    public void setPoltrona(String poltrona){
        if (poltrona != null) {
            this.poltrona = poltrona;
        } else {
            System.out.println("Poltrona é nulo!");
            System.exit(0);
        }
    }
    @Override
    public String toString() {
        return  this.pessoa + "\n" +
                this.sessao + "\n" +
                "Poltrona: " + this.poltrona;
    }




}
