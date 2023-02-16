package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //sistema de almoxerifado do inatel

        System.out.println("BEM VINDO AO ALMOXERIFADO!!");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("FACA SUA REQUISICAO:");

        Scanner in = new Scanner(System.in); //classe que faz a entrada de dados
        String componente = in.nextLine(); // entrando com o componente

        //verificar qual componente eu requeri
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