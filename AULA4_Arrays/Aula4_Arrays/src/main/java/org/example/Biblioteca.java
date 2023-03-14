package org.example;

public class Biblioteca {

    String nome;//nome da biblioteca

    Livro[] livros = new Livro[10]; //array de livros

    public void mostraInfo(){ //metodo para mostra info
        System.out.println("Nome da biblioteca: " +nome);
        System.out.println("------------------");
        for (int i = 0; i < livros.length; i++) {
            if(livros[i]!=null){
                livros[i].mostraInfo();
            }
        }
    }

    public void addLivro(Livro livro){ //metodo para adicionar info
        for (int i = 0; i < livros.length; i++) {
            if(livros[i]==null){
                livros[i] = livro;
                break;
            }

        }

    }
}
