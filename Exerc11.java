package Ativ2Semestre;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o valor fixo do seu salário: R$");
        float salariofixo=sc.nextFloat();

        System.out.println("Digite o valor da sua comissão que recebe por cada carro vendido: R$");
        float comissao=sc.nextFloat();

        System.out.println("Digite a quantidade de carros vendidos no mês: ");
        float quantidadeCarros = sc.nextFloat();

        System.out.println("Digite o valor total vendido no mês: ");
        float valorTotal = sc.nextFloat();

        float totalComissao = quantidadeCarros*comissao;
        float porcentagemValor = valorTotal*5/100;
        float valorFinal= salariofixo+totalComissao+porcentagemValor;

        System.out.println("O valor final do salario é : R$"+valorFinal);

        sc.close(); 


    }

}
