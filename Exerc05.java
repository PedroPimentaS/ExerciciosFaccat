//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 

package Ativ2Semestre;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor inteiro para que seja exibido o antecessor dele: ");
		int valor=sc.nextInt();
		
		int resu= valor-1;

		System.out.println("O antecessor é: "+resu);
		
		sc.close();
	}

}
