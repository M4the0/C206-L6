package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD

        //sistema de almoxerifado do inatel

=======
        
        //sistema de almoxerifado.
        
>>>>>>> 62ebf738661498be47b0f26285c92a8a4eb417b4
        System.out.println("BEM VINDO AO ALMOXERIFADO!!");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("FACA SUA REQUISICAO:");

<<<<<<< HEAD
        Scanner in = new Scanner(System.in); //classe que faz a entrada de dados
        String componente = in.nextLine(); // entrando com o componente

        //verificar qual componente eu requeri
=======

        Scanner in = new Scanner(System.in); //classe scanner para entrada de dados
        String componente = in.nextLine(); //entrando com o componente em questao

        
        //verificando qual componente eu requisitei e se tem no almoxerifado
>>>>>>> 62ebf738661498be47b0f26285c92a8a4eb417b4
        switch (componente) {
            case "RESISTOR":
                System.out.println("Requisitou um resistor");
                break;

            case "CAPACITOR":
                System.out.println("Requisitou um capacitor");
                break;

            case "PROTOBOARD":
                System.out.println("Requisitou um protoboard");
                break;

            default:
                System.out.println("INVALIDO");
                break;
        }
    }
}
