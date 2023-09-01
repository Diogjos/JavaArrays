package invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice1 = new Invoice("818","Filé de Picanha",3, 20);
		
		System.out.println("O codigo é: " + invoice1.getNumero() + " O produto é: " + 
		invoice1.getDescricao() + " Na quantidade de: " + invoice1.qtdComprada + " no preço de: " + 
		invoice1.getPrecoPorItem());
		
		System.out.println("A fatura é : " + invoice1.getInvoiceAmmount() + " R$");
		
		
	}

}
