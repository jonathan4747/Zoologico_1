package com.codingdojo;

public class Mamifero {
	
	private int nivel_energia ;
	
	public Mamifero() {
		this.nivel_energia=100;
	}
	public Mamifero (int nivel_energia) {
		this.nivel_energia = nivel_energia;
	}
	public int getNivel_energia() {
		return nivel_energia;
	}
	public void setNivel_energia(int nivel_energia) {
		this.nivel_energia = nivel_energia;
	}
	
	public int MostrarEnergia() {
		 System.out.println("Energia: "+getNivel_energia());
		 return getNivel_energia();
	}
	

}
