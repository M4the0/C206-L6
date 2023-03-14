package org.example;

public class Main {
    public static void main(String[] args) {
        Livro[] livros =new Livro[10];

        Livro l2 = new Livro("Jogos vorazes");
        livros[0] = l2;
        livros[1] = new Livro("Diario de um banana");

        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i]);

        }
    }
}