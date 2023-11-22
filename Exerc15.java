package Ativ2Semestre;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro :");
		int valor=sc.nextInt();
		
		if (valor>=0) {
			System.out.println("Este numero é positivo");
		} else {
			System.out.println("Este numero é negativo");
		}
		sc.close();
	}

}
