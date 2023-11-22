package Ativ2Semestre;

import java.util.Scanner;

public class Exerc30 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = sc.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = sc.nextDouble();

	        System.out.print("Digite o terceiro valor: ");
	        double valor3 = sc.nextDouble();
	      
	        if(valor1<valor2) {
	        	if(valor2<valor3) {
	        		System.out.println(valor1+" "+valor2+" "+valor3);
	        	}
	        	else if(valor1<valor3) {
	        		System.out.println(valor1+" "+valor3+" "+valor2);
	        	}
	        	else {
	        		System.out.println(valor3+" "+valor1+" "+valor2);
	        	}
	        }
	        
	        else if(valor2<valor3) {
	        	if(valor1<valor3) {
	        		System.out.println(valor2+" "+valor3+" "+valor1);
	        	}
	        	else {
	        		System.out.println(valor2+" "+valor3+" "+valor1);
	        	}
	        }
	        else {
	        	System.out.println(valor3+" "+valor2+" "+valor1);
	        }
	        
	        sc.close();

		
	
	
	
	
	
	}

}
