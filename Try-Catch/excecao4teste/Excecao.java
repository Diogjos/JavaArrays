package excecao4teste;

public class Excecao {

	public static void main(String[] args) {
		int numero [] = { 4, 8, 16, 32, 64, 128 ,256};
		int denominador [] = { 2, 0, 0, 4, 0, 8 };
		try {
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println(numero[i] + " / " + denominador[i] + " is " + numero[i]/denominador[i]);
			}
			catch (ArithmeticException exc) {
				System.out.println("Não pode dividir por zero");
				}
			  }
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Não tem denominador");
				System.out.println("Fatal Error - Programa Encerrado");
		}
	}

	
}

