package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class Ursula extends Personagem{
	private Arma arma;

	public Ursula(String nome, int vida, Arma arma) {
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