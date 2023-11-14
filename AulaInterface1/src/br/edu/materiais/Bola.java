package br.edu.materiais;

import br.edu.interfaces.EmitirSom;

public class Bola implements EmitirSom{

	@Override
	public void emitirSom() {
		System.out.println("Som de Bola");
		
	}
	
}
