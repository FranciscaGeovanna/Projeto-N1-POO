package br.com.ifce.projeton1.principal;

import br.com.ifce.projeton1.armas.Arma;
import br.com.ifce.projeton1.personagens.Personagem;

public class Batalha {
	public void determinarVencedor(Personagem atacante, Arma armaAtacante, Personagem oponente, Arma armaOponente) {
		double chanceAcertoAtacante = (armaAtacante.getPrecisao() * 0.6) + (armaAtacante.getForca() * 0.4);
        double chanceAcertoOponente = (armaOponente.getPrecisao() * 0.6) + (armaOponente.getForca() * 0.4);
        
        if (chanceAcertoAtacante > chanceAcertoOponente) {
            System.out.println("O ataque com " + armaAtacante.getNome() + " é bem-sucedido! " + atacante.getNome() + " ganha a jogada!");
            oponente.sofrerAtaque(armaAtacante.getForca());
            
        } else if (chanceAcertoAtacante < chanceAcertoOponente) {
            System.out.println("O ataque com " + armaOponente.getNome() + " é bem-sucedido! " + oponente.getNome() + " ganha a jogada!");
            atacante.sofrerAtaque(armaOponente.getForca());
            
        } else {
            System.out.println("Ambos os ataques falharam!");
        }
    }
	
	public void batalhar(Personagem play1, Arma armaplay1, Personagem play2, Arma armaplay2) {
		while(play1.vivo() && play2.vivo()) {
			determinarVencedor(play1, armaplay1, play2, armaplay2);
		}
	}
}
