package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int []  arrayInt = {10,20,30,40,50,60,70,80,90,100};
        //System.out.println(arrayInt[2]);

        //comparacao de strings
        //if(nome.equals("victor"))

        Scanner in = new Scanner(System.in);//classe scanner para leitura de dados

        Livro[] livros = new Livro[10];//array de livros

        Biblioteca b1 =new Biblioteca();//instanciando biblioteca
        b1.nome = "Bilac Pinto";



        boolean flag =true;//variavel pata controle do while

        while(flag){

            System.out.println("BEM VINDO AO MENU DA BIBLIOTECA: " + b1.nome);
            System.out.println("1-Cadastrar novo livro");
            System.out.println("2-Mostrar informacoes livros");
            System.out.println("3-Sair do menu");

            int op;
            op= in.nextInt();

            switch (op){

                case 1:
                    System.out.println("CADASTRE UM NOVO LIVRO!");
                    in.nextLine();

                    System.out.println("Entre com o nome do livro: ");
                    String nomelivro = in.nextLine();

                    System.out.println("Entre com a quantidade de paginas: ");
                    int qtdpag = in.nextInt();

                    Livro l = new Livro(nomelivro, qtdpag);

                    b1.addLivro(l);

                    System.out.println("Livro adicionado");

                    break;

                case 2:
                    b1.mostraInfo();
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Entre com um numero valido");
                    break;
            }

        }

        /*
        for (int i = 0; i < livros.length; i++) {
            if(livros[i]!=null) {
                livros[i].mostraInfo();
            }

        }

        */
    }
}