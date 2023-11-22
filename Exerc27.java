package Ativ2Semestre;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int n1 = sc.nextInt();

		if (n1 < 0) {
			System.out.println("Negativo");
		} else if (n1 > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Iguala a zero");

			sc.close();
		}

	}

}
