package com.anncode.lamdas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//clase anonima
		OnOneListener oneListener = new OnOneListener() {
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One: "+message);
			}
		};
		
		//declaracion de una lambda
		OnOneListener  oneListener2 = (String message)->{
			System.out.println("One Lamba: "+message);
		};
		
		oneListener.onOne("Hola sin lambda");
		oneListener2.onOne("Hola Con lambda");
		
		//forma de escribir lambda en una solo linea de código
		OnOneListener onOneListener3 = message -> System.out.println("Tu mensaje: "+message);
	} 
	

}
