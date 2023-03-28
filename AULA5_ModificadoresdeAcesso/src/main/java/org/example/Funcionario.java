package org.example;

public class Funcionario {

    public String nome;
    int id;
    private static int cont=0;

    private int salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        cont++;
        this.id = cont;
        this.salario=salario;
    }

    public void mostraInfo(){
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Id do funcionario: "+this.id);

    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
