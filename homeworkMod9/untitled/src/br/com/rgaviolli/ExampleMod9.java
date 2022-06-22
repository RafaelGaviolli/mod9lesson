package br.com.rgaviolli;

import java.util.Scanner;

public class ExampleMod9 {

    public static void main(String args[]){

        long num1 = 2021;
        Long num2 = num1;
        System.out.println("Fazer o Casting de long para a Wrapper Long seria: " + num2);

        Scanner read = new Scanner(System.in);

        long a;

        System.out.printf("Informe um valor: ");
        a = read.nextLong();

        Long a1 = a;
        System.out.println("Seu valor de long para a Wrapper Long seria: " + a1);
    }
}
