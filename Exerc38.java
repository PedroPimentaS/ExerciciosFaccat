package Ativ2Semestre;

import java.util.Scanner;

public class Exerc38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int codigoUsuarioCorreto = 1234;

		System.out.print("Digite o código de usuário: ");
		int codigoUsuarioDigitado = sc.nextInt();

		if (codigoUsuarioDigitado != codigoUsuarioCorreto) {
			System.out.println("Usuário inválido!");
		} else {
			final int senhaCorreta = 9999;

			System.out.print("Digite a senha: ");
			int senhaDigitada = sc.nextInt();

			if (senhaDigitada != senhaCorreta) {
				System.out.println("Senha incorreta.");
			} else {
				System.out.println("Acesso permitido.");
			}
		}

		sc.close();
	}

}
