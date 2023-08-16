package pacotedelivros;

public class Main {

	public static void main(String[] args) {
		Livro livros[] = new Livro[5];
		livros[0] = new Livro("Java: A Beginner's Guide", "Schildt", 2014);
		livros[1] = new Livro("Java: The Complete Reference", "Schildt", 2014);
		livros[2] = new Livro("The Art of Java", "Schildt and Holmes", 2003);
		livros[3] = new Livro("Red Storm Rising", "Clancy", 1986);
		livros[4] = new Livro("On the Road", "Kerouac", 1955);

		
		for (int i = 0; i < livros.length; i++) {
			livros[i].show();
		};
	}

}
// https://integrada.minhabiblioteca.com.br/reader/books/9788582603376/pageid/284