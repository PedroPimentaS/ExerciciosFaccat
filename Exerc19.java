package Ativ2Semestre;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro :");
		int valor1=sc.nextInt();
		
		System.out.println("Digite um valor inteiro:");
		int valor2=sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println("O maior valor digitado foi :"+valor1);
		} else {
			System.out.println("O maior valor digitado foi :"+valor2);
		}
		sc.close();
	}

}