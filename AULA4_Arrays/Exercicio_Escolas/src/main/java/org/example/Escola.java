package org.example;

public class Escola {

    String nomeEscola; //NOME DA ESCOLA
    String email; // EMAIL DA ESCOLA
    int numTelefone; //NUMERO DE TELEFONE DA ESCOLA
    String endereco; //ENDERECO DA ESCOLA
    Estudante[] estudantes = new Estudante[300]; //ARRAY DE ESTUDANTES

    //VARIAVEIS PARA CONTAGEM DE ALUNOS EM CADA ANO
    int primeiro = 0;
    int segundo = 0;
    int terceiro = 0;

    //CONSTRUTOR DE ESCOLA
    public Escola(String nomeEscola, String email, int numTelefone, String endereco) {
        this.nomeEscola = nomeEscola;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    //METODO PARA ADICIONAR ESTUDANTES NO ARRAY
    public void addEstudante(Estudante estudante) {
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i]==null){
                estudantes[i] = estudante;
                System.out.println("estudante adicionado");
                break;
            }
        }
    }

    //METODO PARA MOSTRAGEM DAS INFORMACOES DA ESCOLA E DOS ESTUDANTES
    public void mostraInfo(){

        System.out.println("Nome da escola: "+nomeEscola);
        System.out.println("Email da escola: "+email);
        System.out.println("Numero de telefone da escola: "+numTelefone);
        System.out.println("Endereco da escola: "+endereco);
        System.out.println("Estudantes matriculados na escola:");
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i]!=null){
                estudantes[i].mostraInfo();
            }

        }
    }

    //METODO PARA CALCULO DE ESTUDANTES EM CADA ANO
    public void QtdEstudantesporAno(){
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equals("Primeiro")) {
                    primeiro++;
                } else if (estudantes[i].ano.equals("Segundo")) {
                    segundo++;
                } else if (estudantes[i].ano.equals("Terceiro")) {
                    terceiro++;
                }
            }
        }
        System.out.println("Alunos do primeiro: " +primeiro);
        System.out.println("Alunos do segundo: " +segundo);
        System.out.println("Alunos do terceiro: " +terceiro);

    }

}
