package br.edu.zoo;

import br.edu.interfaces.Brincar;

public class Gato extends Felino implements Brincar{

	public void emitirSom() {
		System.out.println("Som de Miado");
		
	}
	
	public void brincar() {
		System.out.println("Brincando! MiauMiau");
	}

}
