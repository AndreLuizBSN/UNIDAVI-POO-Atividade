package br.edu.unidavi.webdev.poo.basics;


/*Documentação para entendimento
 * Generic
 * Informo os tipos(sem dizer quais - <T,I,...>
 * Nos metodos eu informo quais tipos serão implementados.
 * nesse caso, quando extender a classe, eu informo o tipo no extends - GameBase<Character, String>
 * */
public abstract class GameBase <T,I>{

	public abstract void jogada(T[] estadoAtualChar, I novaEntrada);
	public abstract int getWrongs();	
	public abstract int getLimit();
	public abstract boolean isCanPlay();
	public abstract boolean isGotcha();	
}
