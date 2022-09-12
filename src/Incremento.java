
public class Incremento {
	public static void main(String[] args) {
		int i = 5;
		// primeiro eu atribuo o valor de i para a variável e depois eu somo 1 ao valor de i
		int x = i++;

		System.out.println(x);
		
		int j = 10;
		// neste caso primeiro é somado ao valor de j para depois ser realizada a passagem de valor para a variável z
		int z = ++j;
		System.out.println(z);
		
		int k = 100;
		int l = k--;
		System.out.println(l);
		
		int n = 100;
		int m = --n;
		System.out.println(m);
	}
}
