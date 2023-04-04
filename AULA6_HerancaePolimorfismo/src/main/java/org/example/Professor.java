package org.example;

public class Professor extends Funcionario{

    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMACOES DO PROFESSOR");
        super.mostraInfo();
        System.out.println("Materia do professor: "+materia);
    }

    public void corrigirProvas(){
        System.out.println("O professor " +getNome()+ "esta corrigindo prova" );
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("o professor "+ getNome()+" esta dando aula");
    }
}


