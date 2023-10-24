package br.edu.figplanas;

public class Circulo extends FigGeoPlana {
	private double raio;
	private double pi;
	
	public void Circulo() {
		pi = 0;
		raio = 0;
	}
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}


	public void calcArea() {
		area = pi * (raio * raio);
	}
	
	public double getArea() {
		return area;
	}
	
	
}
