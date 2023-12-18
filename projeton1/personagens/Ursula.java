package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class Ursula extends Personagem{
	private Arma arma;
	private Arma poder;
	private int agilidade;

	public Ursula(String nome, int vida, int agilidade, Arma arma, Arma poder) {
		super(nome, vida);
		this.arma = arma;
		this.poder = poder;		this.agilidade = agilidade;
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
	
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	
	@Override
	public void atacar(Personagem oponente) {
	    double danoCausado = arma.danoCausado();
		danoCausado += getAgilidade();
	    System.out.printf("%s ataca %s com %s causando %.2f de dano!\n", getNome(), oponente.getNome(), arma.getNome(), danoCausado);
	    oponente.sofrerAtaque(danoCausado);
	}

	@Override
	public void atacarComPoder(Personagem oponente) {
        double danoCausado = arma.danoCausadoPoder();
        System.out.println(getNome() + " ataca " + oponente.getNome() + " com " + poder.getPoder() + " causando " + danoCausado + " de dano!");
        oponente.sofrerAtaque(danoCausado);
	}
}