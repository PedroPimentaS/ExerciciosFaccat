package Ativ2Semestre;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário mensal atual: ");
		float salario=sc.nextFloat();
		
		System.out.println("Digite a porcentagem de reajuste do seu salário: ");
		float porcentagem=sc.nextFloat();
		
		float aumentoReal= salario*porcentagem/100;
		
		float salarioFinal= aumentoReal+salario;
		
		System.out.println("O valor do novo salario é: "+salarioFinal);
		
		sc.close();

	}

}
