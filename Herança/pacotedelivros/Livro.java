package pacotedelivros;

public class Livro {
	private String titulo;
	private String autor;
	private int dataDePublicacao;
	
	Livro (String t, String a, int d) {
		titulo = t; 
		autor = a; 
		dataDePublicacao = d;
	}
	
	void show() { 
		System.out.println(titulo); 
		System.out.println(autor); 
		System.out.println(dataDePublicacao); 
		System.out.println();
	}
		
}