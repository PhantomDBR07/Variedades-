package br.edu.principal;

import br.edu.figplanas.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		
		System.out.println("Triangulo");
		
		t1.setBase(5);
		t1.setAltura(10);
		t1.calcArea();
		System.out.println("A area do Triângulo é de: "+t1.getArea());
		
		Quadrado q1 = new Quadrado();
		
		System.out.println("Quadrado");
		q1.setLado(6);
		q1.calcArea();
		System.out.println("A area do Quadrado é de: "+q1.getArea());
		
		
		Trapezio trp1 = new Trapezio();
		
		System.out.println("Trapézio");
		trp1.setB_maior(10);
		trp1.setB_menor(5);
		trp1.setAltura(10);
		trp1.calcArea();
		System.out.println("A area do Trapézio é de: "+trp1.getArea());
		
		
		Paralelograma prl1 = new Paralelograma();
		
		System.out.println("Paralelograma");
		prl1.setBase(4);
		prl1.setAltura(8);
		prl1.calcArea();
		System.out.println("A area do Paralelograma é de: "+prl1.getArea());
		
		Circulo cir1 = new Circulo();
		
		System.out.println("Circulo");
		cir1.setPi(3.14);
		cir1.setRaio(4);
		cir1.calcArea();
		System.out.println("A area do Circulo é de: "+cir1.getArea());
		
		

	}

}
