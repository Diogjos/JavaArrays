package invoice;

public class Invoice {

	String numero, descricao;
	int qtdComprada;
	double precoPorItem;
	public Invoice(String numero, String descricao, int qtdComprada, double precoPorItem) {
		
		this.numero = numero;
		this.descricao = descricao;
		this.qtdComprada = qtdComprada;
		this.precoPorItem = precoPorItem;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdComprada() {
		return qtdComprada;
	}
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	
	public double getPrecoPorItem() {
		return precoPorItem;
	}
	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = precoPorItem;
	}
	
	
	public double getInvoiceAmmount() {
		return qtdComprada * precoPorItem;
	}
	
}
