package br.com.ifce.projeton1.personagens;

public class Personagem {
	private String nome;
	private int vida;
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void sofrerAtaque(double dano) {
	    vida -= dano;
	    System.out.println("Vida de " + getNome() + " após o ataque: " + vida);
	}
	
	public boolean vivo() {
        if(vida > 0) {
        	return true;
        } else {
        	return false;
        }
    }
	
	public void atacarComPoder(Personagem oponente) {
		System.out.println("Atacando");
	}
	
	public void atacar(Personagem oponente) {
		System.out.println("Atacando");
	}
}