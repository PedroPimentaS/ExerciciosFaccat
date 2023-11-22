package Ativ2Semestre;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa que efetua o calculo da area do retângulo");
		
		System.out.println("\nDigite o valor da base do retângulo: ");
		float base=sc.nextFloat();
		
		System.out.println("Digite o valor da altura do retângulo: ");
		float altura=sc.nextFloat();
		
		float area=base*altura;
		
		System.out.println("O valor da area é: "+area);
		
		
		sc.close();
	}

}
