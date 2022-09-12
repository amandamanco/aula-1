/**
 * Class responsável por verificar se o numero e par ou impar
 * @see System#out
 * @author amand
 * @since 1.0
 * @version 1.1
 */
public class ParOuImpar {
	static final int NUMERO_PARA_TESTE = 1501;

	/**
	 * Nesta aula, o professor passou o operador percent, que identifica números
	 * pares, impares, verifica o resto de divisão e se o número é divisível
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		if (NUMERO_PARA_TESTE % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		if (NUMERO_PARA_TESTE % 3 == 0) {
			System.out.println("DIVISÍVEL POR 3");
		} else {
			System.out.println("NÃO É DIVISÍVEL POR 3");
		}
	}
}
