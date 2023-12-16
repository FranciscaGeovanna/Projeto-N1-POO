package br.com.ifce.projeton1.personagens;

import br.com.ifce.projeton1.armas.Arma;

public class CapitaoGancho extends Personagem{
	private Arma arma;
	private Arma poder;
	private boolean poderUsado;

	public CapitaoGancho(String nome, int vida, Arma arma, Arma poder) {
		super(nome, vida);
		this.arma = arma;
		this.poder = poder;
		this.poderUsado = false;
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
	
	public void atacar(Personagem oponente) {
	    double danoCausado = arma.danoCausado();
	    System.out.println(getNome() + " ataca " + oponente.getNome() + " com " + arma.getNome() + " causando " + danoCausado + " de dano!");
	    oponente.sofrerAtaque(danoCausado);
	}

	public void lancarAdagas(Personagem oponente) {
	    if (!poderUsado) { 
	        double danoCausado = arma.danoCausadoPoder();
	        System.out.println(getNome() + " ataca " + oponente.getNome() + " com " + arma.getNome() + " causando " + danoCausado + " de dano!");
	        oponente.sofrerAtaque(danoCausado);
	        poderUsado = true;
	    } else {
	        System.out.println("O seu poder especial já foi usado!");
	    }
	}
	
	/*public void atacarComPoderEspecial(Personagem oponente) {
		double danoCausado = arma.danoCausadoPoder();
	    System.out.println(getNome() + " ataca " + oponente.getNome() + " com " + arma.getNome() + " causando " + danoCausado + " de dano!");
	    oponente.sofrerAtaque(danoCausado);
	}*/
}