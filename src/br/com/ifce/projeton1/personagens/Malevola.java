package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class Malevola extends Personagem{
	private Arma arma;

	public Malevola(String nome, int vida, Arma arma) {
		super(nome, vida);
		this.setArma(arma);
	}

	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	// usar poder
}
