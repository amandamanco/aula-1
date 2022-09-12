
public class ForBreak {
	public static void main(String[] args) {
		int x = 1;
		int y = 90;
		int numeroAVerificar = 19;
		for (int i = x; i < y; i++) {
			if (i % numeroAVerificar == 0) {
				System.out.println("Achei um número (entre x e y) que é divisível por " + numeroAVerificar +  " : " + i);
				break;
			}
		}

	}
}
