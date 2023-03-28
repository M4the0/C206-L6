package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Joaninha j1 = new Joaninha(10,"vermelho");
        Joaninha j2 = new Joaninha(20,"amarelo");
        Joaninha j3 = new Joaninha(5,"azul");

        System.out.println(Joaninha.qtdJoana);

         */

        Funcionario f1=new Funcionario("Anna", 100);
        Funcionario f2=new Funcionario("Gabriel",1000);

        f1.mostraInfo();
        f2.mostraInfo();

        System.out.println("A anna ganha " + f1.getSalario());

        f1.setSalario(150);

        System.out.println("A anna ganha " + f1.getSalario());



        /*
        System.out.println("temos " + Funcionario.getCont() + " funcionarios na empresa");

        Funcionario.setCont(3);

        System.out.println("temos " + Funcionario.getCont() + " funcionarios na empresa");



         */
    }
}