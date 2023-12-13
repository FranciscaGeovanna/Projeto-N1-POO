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
	
	// atacar 
	public void sofrerAtaque(int dano) {
		vida -= dano;
	}
	
	public boolean vivo() {
        if(vida > 0) {
        	return true;
        } else {
        	return false;
        }
    }
}