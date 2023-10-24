package br.edu.figplanas;

public class Quadrado extends FigGeoPlana {
	private double lado;
	
	public void Quadrado() {
		lado = 0;
		area = 0;
	}
	
	
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}

	public void calcArea() {
		area = lado * lado;
	}
	
}
