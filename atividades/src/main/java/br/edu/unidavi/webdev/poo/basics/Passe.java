package br.edu.unidavi.webdev.poo.basics;

public class Passe {
	
	private String pass;
	
	public Passe(String pass){
		this.pass = pass;
	}
	
	public Character[] initPlaceholder(){
		Character[] placeholder = new Character[this.pass.length()];
		for (int i = 0; i < this.pass.length(); i++)
			placeholder[i] = '*';
	
		return placeholder;
	}
	
	public String getPass(){
		return this.pass;
	}
	
	
}
