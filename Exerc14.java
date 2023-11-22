package Ativ2Semestre;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro :");
		int valor = sc.nextInt();
		
		if(valor<10) {
			System.out.println("Ele não é maior que 10");
		}else if(valor == 10) {
			System.out.println("Igual a 10");
		}else {
			System.out.println("Maior que 10");
		}
		sc.close();
	}

}