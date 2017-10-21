package br.edu.unidavi.webdev.poo.basics;

import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {
		init();
	}
	
	public static void init(){
		Passe passe = new Passe("Ghost");
		Character[] placeholder = passe.initPlaceholder();
		Jogo jogo = new Jogo(passe);
		
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("Your attempt: %d/%d", jogo.getWrongs(), jogo.getLimit());
			String attempt = scanner.nextLine();
			
			jogo.jogada(placeholder, attempt);
			
			System.out.println(jogo.getPlaceholderAsString());
		} while (jogo.isCanPlay());
		scanner.close();
		System.out.println("You ".concat(jogo.isGotcha() ? " win" : " lose"));

	}
}
