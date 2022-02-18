package com.codingdojo;

public class Gorila extends Mamifero {

	
	public void lanzarAlgo() {
		System.out.println("El gorilla arrojo una banana");
		setNivel_energia(getNivel_energia()-5); 	
	}
	
	public void comerBananas() {
		System.out.println("Esta Delicioso!!");
		setNivel_energia(getNivel_energia()+10);
	}
	
	public void escalar() {
		System.out.println("Gorila trepo arbol");
		setNivel_energia(getNivel_energia()-10);
	}

}
