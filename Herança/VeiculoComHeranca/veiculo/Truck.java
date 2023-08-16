package veiculo;

public class Truck extends Veiculo{
	
	  private int capacidadeDeCarga;
	
	
	public Truck(int passageiros, int litrosPorKm, int capacidadeDeLitros, int capacidadeDeCarga) {
		super(passageiros, litrosPorKm, capacidadeDeLitros);
		this.capacidadeDeCarga = capacidadeDeCarga;
		
	}


	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}


	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
			
	

	
}
