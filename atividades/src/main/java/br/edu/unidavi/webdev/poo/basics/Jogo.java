package br.edu.unidavi.webdev.poo.basics;

public class Jogo extends GameBase{
	
	private boolean gotcha = false;
	private int wrongs = 0;
	private int limit = 6;
	private boolean canPlay = true;
	private Passe passe;
	private String placeholderAsString;
	
	public Jogo(Passe passe){
		this.passe = passe;
	}
	
	@Override
	public void jogada(char[] placeholder, String attempt){
		boolean hit = false;
		this.gotcha = true;
		this.placeholderAsString = "";
		for (int i = 0; i < passe.getPass().length(); i++) {
			if (passe.getPass().charAt(i) == attempt.charAt(0)) {
				placeholder[i] = attempt.charAt(0);
				hit = true;
			}
			this.gotcha = this.gotcha & (passe.getPass().charAt(i) == placeholder[i]);
			this.placeholderAsString += placeholder[i];
		}
		if (!hit)
			this.wrongs++;
		this.canPlay = this.wrongs < limit && !gotcha;
	}
	
	@Override
	public int getWrongs(){
		return this.wrongs;
	}
	@Override
	public int getLimit(){
		return this.limit;
	}
	
	public String getPlaceholderAsString(){
		return this.placeholderAsString;
	}
	@Override
	public boolean isCanPlay(){
		return this.canPlay;
	}
	@Override
	public boolean isGotcha(){
		return this.gotcha;
	}
}
