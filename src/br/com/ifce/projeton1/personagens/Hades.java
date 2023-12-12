package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class Hades extends Personagem{
	private Arma arma;

	public Hades(String nome, int vida, Arma arma) {
		super(nome, vida);
		this.setArma(arma);
	}

	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
}
