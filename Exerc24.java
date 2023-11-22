package Ativ2Semestre;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comissao;
        float salarioFinal;

    System.out.println("Digite seu salario fixo: ");
    float salarioFixo= sc.nextFloat();

    System.out.println("Digite o valor de vendas do mês:");
    float totalVendas= sc.nextFloat();

    if (totalVendas<=1500) {
    comissao =totalVendas*3/100;
     salarioFinal=salarioFixo+comissao;

    System.out.println("O salario total é:R$ "+salarioFinal);

    }
    else {
        if(totalVendas>1500) {
    comissao=totalVendas*5/100;
     salarioFinal=salarioFixo+comissao;
    System.out.println("O salario total é:R$ "+salarioFinal);
    

        }
        sc.close();
    }

    }

}
