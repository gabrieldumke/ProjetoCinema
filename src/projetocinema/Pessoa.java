package proejtocinema;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String data;
    String cpf;

    public Pessoa(String nome, String data, String cpf) {
        setNome(nome);
        setData(data);
        setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }
    public String getData() {
        return this.data;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setNome(String nome) {
        if (nome!= null && !nome.isEmpty()){
            this.nome = nome;
        }
        else {
            System.out.println("O nome instanciado está vazio ou é nulo!");
            System.exit(0);
        }
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setCpf(String cpf) {
        boolean isNumeric =  cpf.matches("[+-]?\\d*(\\.\\d+)?");
        if (!cpf.isEmpty() && isNumeric){
            this.cpf = cpf;
        }
        else {
            System.out.println("O cpf instanciado não é numerico ou é igual a 0!");
            System.exit(0);
        }
    }


    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Data de nascimento: " + this.data + "\n" +
                "CPF: " + this.cpf;

    }
    public int computarIdade(String dataAtual){
        int diaNasc = Integer.parseInt(this.data.substring(0,2));
        int mesNasc = Integer.parseInt(this.data.substring(3,5));
        int anoNasc = Integer.parseInt(this.data.substring(6,10));

        int idade = Integer.parseInt(dataAtual.substring(6,10)) - anoNasc ;


        if(Integer.parseInt(dataAtual.substring(3,4)) < mesNasc || Integer.parseInt(dataAtual.substring(0,1)) < diaNasc)
        {
            idade--;
            return idade;
        }
        else
        {
            return idade;
        }
}
}



