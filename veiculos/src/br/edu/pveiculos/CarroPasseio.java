package br.edu.pveiculos;

public class CarroPasseio {
	private double TanqueCombustivel;
	private String Marca;
	private String Ligar;
	private String Desligar;
	private String Acelerar;
	
	public void Utilitario() {
		TanqueCombustivel = 0;
		Marca = " ";
		Ligar = " ";
		Desligar = " ";
		Acelerar = " ";
		
	}

	public double getTanqueCombustivel() {
		return TanqueCombustivel;
	}

	public void setTanqueCombustivel(double tanqueCombustivel) {
		TanqueCombustivel = tanqueCombustivel;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getLigar() {
		return Ligar;
	}

	public String getDesligar() {
		return Desligar;
	}

	public String getAcelerar() {
		return Acelerar;
	}
	
	
	
	
}
