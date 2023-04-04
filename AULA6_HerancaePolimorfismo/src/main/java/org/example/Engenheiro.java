package org.example;

public class Engenheiro extends Funcionario{

    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO ENGENEHRIO");
        super.mostraInfo();
        System.out.println("Ramo do engenherio: "+ramo);
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O engenheiro "+ getNome() + " esta trabalhando");
    }
}
