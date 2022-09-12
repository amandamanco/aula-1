import java.util.Scanner;

public class Se {
	public static void main(String[] args) {
//		byte a = 127;
//		short b = 102;
//		short resultado = (short) (a + b);
//		System.out.println(resultado);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		String nome = scanner.nextLine();

		System.out.println("Informe o ano em que você nasceu: ");
		int anoDeNascimento = scanner.nextInt();

		int resultado = 2022 - anoDeNascimento;
		boolean testeLogico = resultado > 18;

		System.out.println(testeLogico ? ("Maior") : ("Menor"));

		if (testeLogico) {
			System.out.println("Nome: " + nome + ", idade: " + resultado + ", você pode dirigir");
		} else if (resultado > 16) {
			System.out.println("Nome: " + nome + ", idade: " + resultado + ", você pode votar");
		} else {
			System.out.println("Você é totalmente incapaz");
		}

		scanner.close();

	}
}
