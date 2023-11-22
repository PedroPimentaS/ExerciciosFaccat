package Ativ2Semestre;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, maior1, maior2;

		System.out.print("Informe o primeiro valor: ");

		num1 = sc.nextInt();

		System.out.print("Informe o segundo valor: ");

		num2 = sc.nextInt();

		System.out.print("Informe o terceiro valor: ");

		num3 = sc.nextInt();

		// Verifica qual dos 3 números é o maior

		if (num1 > num2 && num1 > num3) {

			maior1 = num1;

			if (num2 > num3) {

				maior2 = num2;

			} else {

				maior2 = num3;

			}

		} else if (num2 > num1 && num2 > num3) {

			maior1 = num2;

			if (num1 > num3) {

				maior2 = num1;

			} else {

				maior2 = num3;

			}

		} else {

			maior1 = num3;

			if (num1 > num2) {

				maior2 = num1;

			} else {

				maior2 = num2;

			}

		}

		// Calcula e exibe a soma dos 2 maiores números

		System.out.println("Soma dos 2 maiores números: " + (maior1 + maior2));
		
		sc.close();
	}
}