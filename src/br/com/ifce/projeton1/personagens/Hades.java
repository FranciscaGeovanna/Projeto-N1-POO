package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class Hades extends Personagem{
	private Arma arma;
	private Arma poder;

	public Hades(String nome, int vida, Arma arma, Arma poder) {
		super(nome, vida);
		this.arma = arma;
		this.poder = poder;
	}

	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public Arma getPoder() {
		return poder;
	}
	public void setPoder(Arma poder) {
		this.poder = poder;
	}
	
	@Override
	public void atacar(Personagem oponente) {
	    double danoCausado = arma.danoCausado();
	    System.out.printf("%s ataca %s com %s causando %.2f de dano!\n", getNome(), oponente.getNome(), poder.getNome(), danoCausado);
	    oponente.sofrerAtaque(danoCausado);
	}

	@Override
	public void atacarComPoder(Personagem oponente) {
        double danoCausado = arma.danoCausadoPoder();
        System.out.println(getNome() + " ataca " + oponente.getNome() + " com " + poder.getPoder() + " causando " + danoCausado + " de dano!");
        oponente.sofrerAtaque(danoCausado);
	}
}