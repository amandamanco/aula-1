package br.com.amanda.manco;

import java.util.Scanner;

public class ExercicioAnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o ano que você deseja consultar?");
		int year = scanner.nextInt();

		int x = year % 400;
		int y = year % 4;
		int z = year % 100;

		if (x == 0 || y == 0 && z != 0) {
			System.out.println("ANO BISSEXTO!!");
		} else {
			System.out.println("NÃO É ANO BISSEXTO!!");
		}

		scanner.close();
	}
}

//Escrever se um ano informado pelo usuário é bissexto ou não. Um ano é bissexto quando é
//(divisível por 400) ou é (divisível por 4 e não por 100).