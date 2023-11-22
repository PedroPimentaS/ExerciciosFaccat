package Ativ2Semestre;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade total de eleiores do municipío: ");
		float quantidadeTotalEleitores = sc.nextInt();

		System.out.println("Digite a quantidade de votos brancos do municipío: ");
		float quantidadeBrancos = sc.nextInt();

		System.out.println("Digite a quantidade total de votos nulos: ");
		float quantidadeVotosNulos = sc.nextInt();

		System.out.println("Digite a quantidade total de votos válidos do municipío: ");
		float quantidadeTotalVotosValidos = sc.nextInt();

		
		// PROCESSAMENTO

		float porcenagemVotosBranco = quantidadeBrancos / quantidadeTotalEleitores * 100;

		
		// SAIDA

		System.out.println("A porcentagem de votos brancos corresponde a: " + porcenagemVotosBranco);

		sc.close();

	}

}
