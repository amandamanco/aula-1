import java.util.Random;

public class Sorteio {
	public static void main(String[] args) {

		Random r = new Random();
		// o valor 11 determina que os números sorteados deverão ser menor que o 11
		int sorteado = r.nextInt(11);
		System.out.println(sorteado);

	}
}
