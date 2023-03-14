package org.example;

public class Livro {

    String nome;//nome do livro
    int numpags;//variavel para qtd pags

    //construtor livro
    public Livro(String nome, int numpags) {
        this.nome = nome;
        this.numpags = numpags;
    }

    //mostrar informacoes do livro
    public void mostraInfo(){

        System.out.println("Nome do livro: " +this.nome);
        System.out.println("Numero de paginas: " +this.numpags);
        System.out.println("--------------------------------");
    }
}
