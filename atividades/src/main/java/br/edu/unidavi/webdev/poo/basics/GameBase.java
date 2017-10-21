package br.edu.unidavi.webdev.poo.basics;

public abstract class GameBase {

	public abstract void jogada(char[] estadoAtualChar, String novaEntrada);
	public abstract int getWrongs();	
	public abstract int getLimit();
	public abstract boolean isCanPlay();
	public abstract boolean isGotcha();	
}
