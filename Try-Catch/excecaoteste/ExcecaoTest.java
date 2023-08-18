package excecaoteste;

public class ExcecaoTest {
	static void getExcecao () {
		int numeros[] = new int [4];
		
		System.out.println("Before exception is generated.");
		numeros [7] = 10;
		System.out.println("this won't be displayed");

	}
}
