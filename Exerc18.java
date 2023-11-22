package Ativ2Semestre;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual=sc.nextInt();
		System.out.println("Digite o seu ano de nascimento atual :");
		int anoDeNascimento=sc.nextInt();
		int idade=anoAtual-anoDeNascimento;
		if (idade>=16) {
			System.out.println("Você está apto à votar");
		} else {
			System.out.println("Você não está apto à votar");

		}
		sc.close();
	}

}