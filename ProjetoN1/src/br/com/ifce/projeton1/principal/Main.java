package br.com.ifce.projeton1.principal;

import java.util.Scanner;

import br.com.ifce.projeton1.personagens.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("================ Seja bem-vindo(a) ao jogo! ================");
		System.out.println("Esses são os personagens disponíveis: ");
		System.out.println("1 - Malévola");
		System.out.println("2 - Capitão Gancho");
		System.out.println("3 - Rainha de Copas");
		System.out.println("4 - Hades");
		System.out.println("5 - Úrsula");
		System.out.println("6 - Gastón");
		
		for(int i = 1; i <= 2; i++) {
			System.out.println("Jogador " + i + " escolha seu personagem...");
			int j = ler.nextInt();
			if(j == 0 || j > 6) {
				System.out.println("Opção inválida!");
				break;
			}
			
			if(j == 1) {
				Malevola m = new Malevola("Malévola", 100, null);
				System.out.println("Parabéns, você escolheu a Malévola, uma fada super poderosa e malvada!");
				System.out.println("Sua arma é um centro de ouro afiado, que também pode ser usado com magia negra");
				System.out.println("Boa sorte!");
			}
			else if(j == 2) {
				CapitaoGancho cg = new CapitaoGancho("Capitão Gancho", 125, null);
				System.out.println("Parabéns, você escolheu o Capitão Gancho, o pirata mais temido da Terra do Nunca!");
				System.out.println("Sua arma é uma espada, mas ele também pode atirar várias adagas de uma vez!");
				System.out.println("Boa sorte!");
			}
			else if(j == 3) {
				RainhaDeCopas rc = new RainhaDeCopas("Rainha de Copas", 100, null);
				System.out.println("Parabéns, você escolheu a Rainha de Copas, uma fada super poderosa e malvada!");
				System.out.println("Sua arma é uma varinha mágica, mas ela também pode liberar cartas de baralho cortante");
				System.out.println("Boa sorte!");
			}
			else if(j == 4) {
				Hades h = new Hades("Hades", 100, null);
				System.out.println("Parabéns, você escolheu o Hades, um deus grego do submundo!");
				System.out.println("Sua arma é um cajado das sombras, porém o Hades também pode empunhar um relâmpago");
				System.out.println("Boa sorte!");
			}
			else if(j == 5) {
				Ursula u = new Ursula("Úrsula", 100, null);
				System.out.println("Parabéns você escolheu a Úrsula, a mais temida dos mares!");
				System.out.println("Sua arma são seus tentáculos super fortes, ela também pode atacar com uma cortina de tinta preta");
				System.out.println("Boa sorte!");
			}
			else if(j == 6){
				Gaston g = new Gaston("Gastón", 100, null);
				System.out.println("Parabéns você escolheu o Gastón, um caçador habilidoso!");
				System.out.println("Sua arma é um arco e flecha, que também pode atirar flechas flamejantes");
				System.out.println("Boa sorte!");
			}
		}
		
		boolean jogar = true;
		while(jogar == true) {
			for(int i = 1; i <= 2; i++) {
				System.out.println("Jogador " + i + " escolha sua forma de ataque...");
				System.out.println("1 - Atacar com a sua arma");
				System.out.println("2 - Atacar com poder especial");
				System.out.println("3 - Desistir");
				int a = ler.nextInt();
				
				if(a == 1) {
					System.out.println("Vamos atacar!!");
				}
			}
		}
	}

}
