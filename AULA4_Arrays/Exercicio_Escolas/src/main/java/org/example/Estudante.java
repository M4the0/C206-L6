package org.example;

public class Estudante {

    String nome; //NOME DO ESTUDANTE
    int idade; //IDADE DO ESTUDANTE
    String ano; //ANO DO ESTUDANTE

    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public void mostraInfo(){
        System.out.println("Nome do estudante: " +this.nome);
        System.out.println("Idade do estudante: " + this.idade);
        System.out.println("Ano do estudante: " + this.ano);

    }
}
