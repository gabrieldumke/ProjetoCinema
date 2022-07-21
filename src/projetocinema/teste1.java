package projetocinema;

public class teste1 {
    public static void main(String[] args) {
        //a
        Pessoa pessoaA = new Pessoa("Ana", "16/08/1999", "73795585497");
        Pessoa pessoaB = new Pessoa("Nany", "31/03/2000", "73694383232");
        Pessoa pessoaC = new Pessoa("Rayzinha", "09/07/2000", "7394383232");
        //b
        Filme filme1 = new Filme("Deu a louca na chapeuzinho", 16);
        Filme filme2 = new Filme("The Batman", 18);
        //c
        Sessao sessao1 = new Sessao("1002", "18:00", "21:00", filme2);
        Sessao sessao2 = new Sessao("198975", "21:00", "00:00",filme1);
        //d
        Ingresso ingresso1 = new Ingresso(sessao1, pessoaA,  "19B");
        Ingresso ingresso2 = new Ingresso(sessao1,pessoaB,"18B");
        Ingresso ingresso3 = new Ingresso(sessao2, pessoaC, "07C");

        //e
        System.out.println("Idade: " + ingresso1.pessoa.computarIdade("20/04/2022"));
        System.out.println("Classificação do filme: " + ingresso1.sessao.filme.idadeMin);
        //f
        System.out.println("Nome do filme: " + ingresso2.sessao.filme.nome);
        System.out.println("Número da sala: " + ingresso2.sessao.nSala);



    }
}
