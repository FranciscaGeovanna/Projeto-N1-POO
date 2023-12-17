package br.com.ifce.projeton1.principal;

import java.util.Scanner;
import br.com.ifce.projeton1.personagens.Personagem;

public class Batalha {
    Scanner ler = new Scanner(System.in);

    public void batalhar(Personagem play1, Personagem play2) {
        while (play1.vivo() && play2.vivo()) {
            for (int i = 1; i <= 2; i++) {
                int a;
                boolean escolhaValida = false;

                while (!escolhaValida) {
                    System.out.println("\nJogador " + i + ", escolha sua forma de ataque...");
                    System.out.println("1 - Atacar com sua arma");
                    System.out.println("2 - Atacar com poder especial");
                    System.out.println("3 - Desistir");

                    a = ler.nextInt();

                    if (a >= 1 && a <= 3) {
                        escolhaValida = true;
                    } else {
                        System.out.println("Por favor, digite uma opção válida!");
                    }
                

	                if (a == 1) {
	                    if (i == 1) {
	                        System.out.println("Atacando o oponente...");
	                        play1.atacar(play2);
	                        System.out.println("Vida de " + play1.getNome() + ": " + play1.getVida());
	                        if(play2.getVida() == 0) {
	                            System.out.println("O jogador 1 com o personagem " + play1.getNome() + "venceu!");
	                            break;
	                        }
	                    } else {
	                        System.out.println("Atacando oponente...");
	                        play2.atacar(play1);
	                        System.out.println("Vida de " + play2.getNome() + ": " + play2.getVida());
	                        if(play1.getVida() == 0) {
	                            System.out.println("O jogador 2 com o personagem " + play2.getNome() + "venceu!");
	                            break;
	                        }
	                    }
	                } else if (a == 2) {
	                    if (i == 1) {
	                        System.out.println("Vamos atacar com poder especial!!");
	                        play1.atacarComPoder(play2);
	                        System.out.println("Vida de " + play1.getNome() + ": " + play1.getVida());
	                        if(play2.getVida() == 0) {
	                            System.out.println("O jogador 1 com o personagem " + play1.getNome() + "venceu!");
	                            break;
	                        }
	                    } else {
	                        System.out.println("Vamos atacar com poder especial!!");
	                        play2.atacarComPoder(play1);
	                        System.out.println("Vida de " + play2.getNome() + ": " + play2.getVida());
	                        if(play1.getVida() == 0) {
	                            System.out.println("O jogador 2 com o personagem " + play2.getNome() + "venceu!");
	                        }
	                    }
	                } else if (a == 3) {
	                    if (i == 1) {
	                        System.out.println("Jogador " + i + " desistiu. ");
	                        System.out.println("Jogador 2 com o personagem " + play2.getNome() + "venceu!");
	                    } else {
	                        System.out.println("Jogador " + i + " desistiu. ");
	                        System.out.println("Jogador 1 com o personagem " + play1.getNome() + " venceu!");
	                    }
	                    return;
	                }
                }  
            }
        }
    }
}
