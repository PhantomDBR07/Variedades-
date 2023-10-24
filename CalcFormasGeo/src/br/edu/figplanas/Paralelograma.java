package br.edu.figplanas;

public class Paralelograma extends FigGeoPlana{
	private double base;
	private double altura;
	
	public void Paralelograma() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void calcArea() {
		area = base * altura;
	}
	
}
