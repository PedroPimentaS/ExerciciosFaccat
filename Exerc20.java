package Ativ2Semestre;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro valor :");
    int valor=sc.nextInt();
    System.out.println("Digite o segundo valor :");
    int valor1=sc.nextInt();

    if (valor==valor1) 
    {
        System.out.println("Digite valores diferentes");
    }
    else if (valor>valor1) 
    {
        System.out.println("O menor número digitado foi "+valor1+" e o maior número digitado foi "+valor);
    } 
    else 
    {
        System.out.println("O menor número digitado foi "+valor+" e o maior número digitado foi "+valor1);
    }
    sc.close();
}

}