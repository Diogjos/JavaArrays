package veiculo;

public class Veiculo {
private	int passageiros, litrosPorKm, capacidadeDeLitros;



public Veiculo(int passageiros, int litrosPorKm, int capacidadeDeLitros) {	
	this.passageiros = passageiros;
	this.litrosPorKm = litrosPorKm;
	this.capacidadeDeLitros = capacidadeDeLitros;
}

int alcance () {
	return capacidadeDeLitros * litrosPorKm;
}

int litrosPrecisos (int distancia) {
	return distancia / litrosPorKm;
}

public int getPassageiros() {
	return passageiros;
}

public void setPassageiros(int passageiros) {
	this.passageiros = passageiros;
}

public int getLitrosPorKm() {
	return litrosPorKm;
}

public void setLitrosPorKm(int litrosPorKm) {
	this.litrosPorKm = litrosPorKm;
}

public int getCapacidadeDeLitros() {
	return capacidadeDeLitros;
}

public void setCapacidadeDeLitros(int capacidadeDeLitros) {
	this.capacidadeDeLitros = capacidadeDeLitros;
}


}
