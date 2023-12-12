package br.com.ifce.projeton1.armas;

public class Arma {
	private String nome;
	private int forca;
	private String poder;
	
	public Arma(String nome, int forca, String poder) {
		this.nome = nome;
		this.forca = forca;
		this.poder = poder;
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

	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
}
