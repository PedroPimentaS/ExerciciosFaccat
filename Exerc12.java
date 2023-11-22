package Ativ2Semestre;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = sc.nextFloat();

        double celsius= (fahrenheit-32)/1.8; 

        System.out.printf("a temperatura em Celsius é de: "+new DecimalFormat(".#").format(celsius)+" graus.");

        sc.close();

    }

}