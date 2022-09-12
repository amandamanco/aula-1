
public class Tipos {
	public static void main(String[] args) {

		// números inteiros
		byte tamanhoMaximoByte = Byte.MAX_VALUE; // 2^8
		byte tamanhoMinimoByte = Byte.MIN_VALUE;
		short tamanhoMaximoShort = Short.MAX_VALUE; // 2^16
		short tamanhoMinimoShort = Short.MIN_VALUE;
		int tamanhoMaximoInt = Integer.MAX_VALUE; // 2^32
		int tamanhoMinimoInt = Integer.MIN_VALUE;
		long tamanhoMaximoLong = Long.MAX_VALUE; // 2^64
		long tamanhoMinimoLong = Long.MIN_VALUE;

		// números reais
		float tamanhoMinimoFloat = Float.MIN_VALUE;
		float tamanhoMaximoFloat = Float.MAX_VALUE;
		double tamanhoMinimoDouble = Double.MIN_VALUE;
		double tamanhoMaximoDouble = Double.MAX_VALUE;

//		boolean verdadeiro = true;
		// char deve ter aspas simples
//		char caractere = 'a';
//		String texto = "Aqui é uma string";

		System.out.println("NÚMEROS INTEIROS");
		System.out.println("byte vai de " + tamanhoMinimoByte + " a " + tamanhoMaximoByte);
		System.out.println("short vai de  " + tamanhoMinimoShort + "a " + tamanhoMaximoShort);
		System.out.println("int vai de " + tamanhoMinimoInt + " a " + tamanhoMaximoInt);
		System.out.println("long vai de  " + tamanhoMinimoLong + " a " + tamanhoMaximoLong);
		System.out.println("NÚMEROS REAIS");
		System.out.println("float vai de  " + tamanhoMinimoFloat + " a " + tamanhoMaximoFloat);
		System.out.println("double vai de  " + tamanhoMinimoDouble + " a " + tamanhoMaximoDouble);

	}
}
