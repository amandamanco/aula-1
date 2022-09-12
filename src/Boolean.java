
public class Boolean {
	public static void main(String[] args) {
		int numero = 10;

		boolean teste1 = numero > 5;
		boolean teste2 = numero > 5;
		boolean teste3 = numero >= 10;
		boolean teste4 = numero <= 5;
		boolean teste5 = numero == 5;
		boolean teste6 = numero != 5;
		boolean teste7 = numero > 1 && numero < 11;
		boolean teste8 = numero > 1 || numero < 11;
		boolean teste9 = numero < 1 || numero > 11 || numero == 15 || numero < 25;

		System.out.println("TESTE 1: " + teste1);
		System.out.println("TESTE 2: " + teste2);
		System.out.println("TESTE 3: " + teste3);
		System.out.println("TESTE 4: " + teste4);
		System.out.println("TESTE 5: " + teste5);
		System.out.println("TESTE 6: " + teste6);
		System.out.println("TESTE 7: " + teste7);
		System.out.println("TESTE 8: " + teste8);
		System.out.println("TESTE 9: " + teste9);
	}
}
