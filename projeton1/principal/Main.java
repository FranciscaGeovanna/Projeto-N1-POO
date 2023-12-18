package br.com.ifce.projeton1.principal;

import java.util.Scanner;

import br.com.ifce.projeton1.armas.Arma;
import br.com.ifce.projeton1.personagens.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Personagem jogador1 = null;
		Personagem jogador2 = null;
		
		System.out.println("================ Seja bem-vindo(a) ao jogo! ================");
		System.out.println("Esses são os personagens disponíveis: ");
		System.out.println("1 - Malévola");
		System.out.println("2 - Capitão Gancho");
		System.out.println("3 - Rainha de Copas");
		System.out.println("4 - Hades");
		System.out.println("5 - Úrsula");
		System.out.println("6 - Gastón");
		
		for(int i = 1; i <= 2; i++) {
			System.out.println("\nJogador " + i + " escolha seu personagem...");
			int j = ler.nextInt();
			while(j < 1 || j > 6) {
				System.out.println("Opção inválida!");
				System.out.println("\nJogador " + i + " escolha seu personagem...");
				j = ler.nextInt();
			}
			
			if(j == 1) {
				Arma a = new Arma("Bastão", 35, 3);
				Arma poder = new Arma("Mágia Negra", 45);
				Malevola m = new Malevola("Malévola", 100, a, poder);
				System.out.println("Parabéns, você escolheu a Malévola, uma fada super poderosa e malvada!");
				System.out.println("Sua arma é um centro de ouro afiado, que também pode ser usado com magia negra.");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = m;
				} else {
					jogador2 = m;
				}
			}
			else if(j == 2) {
				Arma a = new Arma("Espada", 15, 3);
				Arma poder = new Arma("Chuva de Adagas", 28);
				CapitaoGancho capitao = new CapitaoGancho("Capitão Gancho", 125, a, poder);
				System.out.println("Parabéns, você escolheu o Capitão Gancho, o pirata mais temido da Terra do Nunca!");
				System.out.println("Ele também tem 25 de vida a mais que seus adversários.");
				System.out.println("Sua arma é uma espada, mas ele também pode atirar várias adagas de uma vez!");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = capitao;
				} else {
					jogador2 = capitao;
				}
			}
			else if(j == 3) {
				Arma a = new Arma("Varinha", 18, 7);
				Arma poder = new Arma("Cartas de baralho cortantes", 40);
				RainhaDeCopas rainha = new RainhaDeCopas("Rainha de copas", 100, a, poder);
				System.out.println("Parabéns, você escolheu a Rainha de Copas, uma fada super poderosa e malvada!");
				System.out.println("Sua arma é uma varinha mágica, mas ela também pode liberar cartas de baralho cortante.");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = rainha;
				} else {
					jogador2 = rainha;
				}
			}
			else if(j == 4) {
				Arma a = new Arma("Cajado das sombras", 20, 8);
				Arma poder = new Arma("Relâmpago", 52);
				Hades h = new Hades("Hades", 100, a, poder);
				System.out.println("Parabéns, você escolheu o Hades, um deus grego do submundo!");
				System.out.println("Sua arma é um cajado das sombras, porém o Hades também pode empunhar um relâmpago.");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = h;
				} else {
					jogador2 = h;
				}
			}
			else if(j == 5) {
				Arma a = new Arma("Tentáculos", 15, 9);
				Arma poder = new Arma("Cortina de tinta preta", 50);
				Ursula u = new Ursula("Úrsula", 100, 2, a, poder);
				System.out.println("Parabéns você escolheu a Úrsula, a mais temida dos mares!");
				System.out.println("Sua arma são seus tentáculos super fortes, ela também pode atacar com uma cortina de tinta preta.");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = u;
				} else {
					jogador2 = u;
				}
			}
			else if(j == 6){
				Arma a = new Arma("Arco e Flecha", 38, 4);
				Arma poder = new Arma("Flecha flamejante", 48);
				Gaston g = new Gaston("Gastón", 100, a, poder);
				System.out.println("Parabéns você escolheu o Gastón, um caçador habilidoso!");
				System.out.println("Sua arma é um arco e flecha, que também pode atirar flechas flamejantes.");
				System.out.println("Boa sorte!");
				if(i == 1) {
					jogador1 = g;
				} else {
					jogador2 = g;
				}
			}
		}
		
		Batalha b = new Batalha();
		b.batalhar(jogador1, jogador2);
		
		ler.close();
	}
}
