package br.com.amanda.manco;
import java.util.Scanner;

public class ExercicioVelocidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é a velocidade do seu carro? ");
		int velocidadeDoVeiculo = scanner.nextInt();

		System.out.println("Qual a velocidade máxima da via? ");
		int velocidadeDaVia = scanner.nextInt();

		double multa = 0;
		int velocidade = velocidadeDoVeiculo - velocidadeDaVia;

		if (velocidade > 31) {
			multa = 300;
			System.out.println("Você recebeu uma multa de " + multa + " reias.");
		} else if (velocidade >= 11) {
			multa = 100;
			System.out.println("Você recebeu uma multa de " + multa + " reais.");
		}

		else if (velocidade > 0) {
			multa = 50;
			System.out.println("Você recebeu uma multa de " + multa + " reais.");
		} else {

			System.out.println("Você respeitou as leis de trânsito!");
		}

		scanner.close();
	}
}

//Crie um programa java que leia a velocidade de um carro e a velocidade máxima para a via:
//1. Informe 50 reais se estiver até 10km/h acima;
//2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
//3. Informe 300 reais se estiver acima de 31km/h acima.
