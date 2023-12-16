// ... (código anterior)

// Classe Batalha
package br.com.ifce.projeton1.principal;
import java.util.Scanner;
import br.com.ifce.projeton1.armas.Arma;
import br.com.ifce.projeton1.personagens.Personagem;

public class Batalha {
	Scanner ler = new Scanner(System.in);
    public void determinarVencedor(Personagem atacante, Arma armaAtacante, Personagem oponente, Arma armaOponente) {
        double chanceAcertoAtacante = (armaAtacante.getPrecisao() * 0.6) + (armaAtacante.getForca() * 0.4);
        double chanceAcertoOponente = (armaOponente.getPrecisao() * 0.6) + (armaOponente.getForca() * 0.4);

        if (chanceAcertoAtacante > chanceAcertoOponente) {
            System.out.println("O ataque com " + armaAtacante.getNome() + " é bem-sucedido! " + atacante.getNome() + " ganha a jogada!");
            oponente.sofrerAtaque(armaAtacante.danoCausado()); // Use o método danoCausado para calcular o dano
        } else if (chanceAcertoAtacante < chanceAcertoOponente) {
            System.out.println("O ataque com " + armaOponente.getNome() + " é bem-sucedido! " + oponente.getNome() + " ganha a jogada!");
            atacante.sofrerAtaque(armaOponente.danoCausado()); // Use o método danoCausado para calcular o dano
        } else {
            System.out.println("Ambos os ataques falharam!");
        }
    }

    public void batalhar(Personagem play1, Personagem play2) {
        while (play1.vivo() && play2.vivo()) {
            for (int i = 1; i <= 2; i++) {
                System.out.println("\nJogador " + i + ", escolha sua forma de ataque...");
                System.out.println("1 - Atacar com sua arma");
                System.out.println("2 - Atacar com poder especial");
                System.out.println("3 - Desistir");
                int a = ler.nextInt();

                if (a == 1) {
                    if (i == 1) {
                        System.out.println("Vamos atacar!!");
                        play1.atacar(play2);
                        System.out.println("Vida restante de " + play2.getNome() + ": " + play2.getVida());
                    } else {
                        System.out.println("Vamos atacar!!");
                        play2.atacar(play1);
                        System.out.println("Vida restante de " + play1.getNome() + ": " + play1.getVida());
                    }
                } else if (a == 2) {
                    if (i == 1) {
                        System.out.println("Vamos atacar com poder especial!!");
                        play1.atacarComPoder(play2);
                        System.out.println("Vida restante de " + play2.getNome() + ": " + play2.getVida());
                    } else {
                        System.out.println("Vamos atacar com poder especial!!");
                        play2.atacarComPoder(play1);
                        System.out.println("Vida restante de " + play1.getNome() + ": " + play1.getVida());
                    }
                } else if (a == 3) {
                    System.out.println("Jogador " + i + " desistiu. " + (i == 1 ? play2.getNome() : play1.getNome()) + " vence!");
                    return;
                }
            }
        }
    }
}

// ... (código anterior)
