package employe;

public class Employe {
	
	String nome, sobrenome;
	double salarioMensal;
	
	public Employe(String nome, String sobrenome, double salarioMensal) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		
		return salarioMensal;
		
	}

	public void setSalarioMensal(double salarioMensal) {
		if (salarioMensal > 0) {
		this.salarioMensal = salarioMensal;
		}
	}
	
}
