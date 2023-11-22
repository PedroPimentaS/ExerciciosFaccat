package Ativ2Semestre;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {

		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a quantidade de maças compradas :");
		int macas = sc.nextInt();

		if (macas < 1) {
			System.out.println("O numero de maças não é valido");
		} else if (macas < 12) {
			double resultado = macas * 1.3;
			System.out.println("O valor pago é: R$" + resultado);

		} else {
			
			System.out.println("O valor a ser pago é : R$" + macas);
		}
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Digite somente número inteiros"+e);
		}
		}

}