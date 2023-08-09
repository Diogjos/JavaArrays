package veiculo;

public class Main {

	public static void main(String[] args) {
		Truck pickup = new Truck(2, 8, 21, 1000);
		
		System.out.println(pickup.alcance() + " quilometros você consegue andar com essa quantidade de combustivel");
		System.out.println("");
		System.out.println("");
		System.out.println(pickup.litrosPrecisos(20) + " litros necessarios para percorrer a quantidade de quilometros que você colocou");
		// insiera a quantidade de km no metodo acima para rodar (tem que ser valor inteiro)
	}

}






//https://integrada.minhabiblioteca.com.br/reader/books/9788582603376/pageid/254