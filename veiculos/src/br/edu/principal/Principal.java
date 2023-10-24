package br.edu.principal;

import br.edu.pveiculos.*;

public class Principal {

	public static void main(String[] args) {
		Jipe j1 = new Jipe();
		
		System.out.println("Jipe");
		
		j1.setTanqueCombustivel(100.50);
		j1.setMarca("Motorola");
		
		System.out.println("Jipe Modelo: "+j1.getMarca());
		System.out.println("Tanque de Combustível: "+j1.getTanqueCombustivel()+"L");
		
		Utilitario u1 = new Utilitario();
		
		System.out.println("Utilitario");
		
		u1.setTanqueCombustivel(175.5);
		u1.setMarca("Samsung");
		
		System.out.println("Utilitario Modelo: "+u1.getMarca());
		System.out.println("Tanque de Combustível: "+u1.getTanqueCombustivel()+"L");
		
		CarroPasseio p1 = new CarroPasseio();
		
		System.out.println("CarroPasseio");
		
		u1.setTanqueCombustivel(60.75);
		u1.setMarca("Iphone");
		
		System.out.println("Carro de Passeio Modelo: "+p1.getMarca());
		System.out.println("Tanque de Combustível: "+p1.getTanqueCombustivel()+"L");
		

	}

}
