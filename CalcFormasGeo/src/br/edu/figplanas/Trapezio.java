package br.edu.figplanas;

public class Trapezio extends FigGeoPlana {
	private double b_maior;
	private double b_menor;
	private double altura;
	
	public void Trapezio() {
		b_maior = 0;
		b_menor = 0;
		altura = 0;
		area = 0;
	}
	
	
	
	public double getB_maior() {
		return b_maior;
	}



	public void setB_maior(double b_maior) {
		this.b_maior = b_maior;
	}



	public double getB_menor() {
		return b_menor;
	}



	public void setB_menor(double b_menor) {
		this.b_menor = b_menor;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void calcArea() {
		area = ((b_maior * b_menor) * altura)/2;
	}
	
}
