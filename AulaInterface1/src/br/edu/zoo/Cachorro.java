package br.edu.zoo;

import br.edu.interfaces.Brincar;

public class Cachorro extends Canine implements Brincar{

	@Override
	public void emitirSom() {
		System.out.println("Som de Latido");
		
	}
	public void Farejar() {
		System.out.println("Farejando...");
	}
	@Override
	public void brincar() {
		System.out.println("Brincando! AuAu");
		
	}

}
