package br.com.ifce.projeton1.armas;

import java.util.Random;

public class Arma {
	private String nome;
	private int forca;
	private int precisao;
	private String poder;
	private int forcaPoder;
	
	public Arma(String nome, int forca, int precisao) {
		this.nome = nome;
		this.forca = forca;
		this.precisao = precisao;
	}
	
	public Arma(String poder, int forcaPoder) {
		this.poder = poder;
		this.forcaPoder = forcaPoder;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getPrecisao() {
		return precisao;
	}
	public void setPrecisao(int precisao) {
		this.precisao = precisao;
	}
	
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	public int getForcaPoder() {
		return forcaPoder;
	}
	public void setForcaPoder(int forcaPoder) {
		this.forcaPoder = forcaPoder;
	}
	
	/*public int danoCausado() {
	    Random random = new Random();
	    int variacao = random.nextInt(61) + 10; 
	    int danoBase = (int) ((this.forca * 1) + (this.precisao * 1.5));
	    int dano = danoBase + variacao;
	    System.out.println("Dano causado: " + dano);
	    return dano;
	}*/

	
	public double danoCausado() {
		double dano = (this.forca*0.4) + (this.precisao*0.6);
		return dano;
	}
	
	public double danoCausadoPoder() {
		double dano = (this.forca*0.6) + (this.precisao*0.4) + (this.forcaPoder * 0.6);
		return dano;
	}
}