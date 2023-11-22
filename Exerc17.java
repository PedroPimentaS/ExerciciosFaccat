package Ativ2Semestre;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {

		try {
			
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da primeira Nota :");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o valor da segunda  Nota :");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;

		if ((media < 0) || (media > 10)) {
			System.out.println("Somente números entre 0 e 10 ");
		} else if (media >= 6) {
			System.out.println("Aluno(a) aprovado(a) com sucesso. Média foi :" + media);
		} else {
			System.out.println("Aluno(a) reprovado(a). Média foi :" + media);
		}
		sc.close();
		} catch (Exception a) {
			System.out.println("Não aceitamos caracteres para efetuar operações matemáticas"+a);
		}
	}
}