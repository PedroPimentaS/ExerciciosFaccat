package Ativ2Semestre;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do custo de fabricação do automóvel : R$");
		float valorAutomovel = sc.nextFloat();
		float distribuidor = valorAutomovel*28/100;
		float impostor = valorAutomovel*45/100;
		float valorFinal= valorAutomovel+ distribuidor+impostor;
		System.out.println("O valor final do automóvel corresponde a : R$"+valorFinal);

		sc.close();
	}

}
