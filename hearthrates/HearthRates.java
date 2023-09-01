package hearthrates;

public class HearthRates {
	
	String nome, sobrenome;
	int anoNascimento, mesNascimento, diaNascimento;
	double altura, massaCorporal;
	public HearthRates(String nome, String sobrenome, int anoNascimento, int mesNascimento, int diaNascimento,
			double altura, double massaCorporal) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.anoNascimento = anoNascimento;
		this.mesNascimento = mesNascimento;
		this.diaNascimento = diaNascimento;
		this.altura = altura;
		this.massaCorporal = massaCorporal;
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
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getMassaCorporal() {
		return massaCorporal;
	}
	public void setMassaCorporal(double massaCorporal) {
		this.massaCorporal = massaCorporal;
	}
	
	
	
	public double getIdade(double idade) {
		return idade = 2023 - anoNascimento;
	}
	
	public double getImc() {
		return massaCorporal / Math.pow(altura, 2);
	}
	
	
	
}