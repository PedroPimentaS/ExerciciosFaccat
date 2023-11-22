package Ativ2Semestre;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicio=24;
		int horaFinal = 24;

		while ((horaInicio < 0) || (horaInicio > 23)) {
			System.out.println("Digite o horário que começa a partida de Xadrez :");
			horaInicio = sc.nextInt();
		}
		while ((horaFinal < 0) || (horaFinal > 23)) {
			System.out.println("Digite o horário que termina a partida de Xadrez :");
			horaFinal = sc.nextInt();
		}
		
		int HorasJogo = horaFinal - horaInicio;
		if (HorasJogo < 0) {
			HorasJogo = HorasJogo + 24;
			System.out.println("A quantidade de horas jogadas corresponde a :" + HorasJogo + " horas");
		} else if (HorasJogo == 0) {
			System.out.println("Fim do jogo, a duração chegou a 24 horas");
		} else {
			System.out.println("A quantidade de horas jogadas corresponde a :" + HorasJogo + " horas");
		}

		sc.close();
	}

}