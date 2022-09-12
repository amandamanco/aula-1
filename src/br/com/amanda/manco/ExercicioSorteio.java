package br.com.amanda.manco;

import java.util.Random;
import java.util.Scanner;

public class ExercicioSorteio {
	public static void main(String[] args) {
		Random r = new Random();
		int sorteado = r.nextInt(5);

		Scanner scanner = new Scanner(System.in);
		System.out.println("O número foi sorteado!! Tente adivinhar qual é!");
		int tentativa = scanner.nextInt();

		while (tentativa != sorteado) {

			if (tentativa < sorteado) {
				System.out.println("MAIOR!");
			} else if (tentativa > sorteado) {
				System.out.println("MENOR!!");
			}
			System.out.println("Tente novamente...");
			tentativa = scanner.nextInt();
		}
		System.out.println("Você acertou!" + sorteado);
		scanner.close();
	}
}

//1. Faça um laço de repetição que solicite ao usuário digitar um número; 
//2. O laço encerra quando o usuário acertar o número; 
//3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.
