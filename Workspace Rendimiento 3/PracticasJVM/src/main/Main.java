package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int n=0;
		ArrayList listaFloats=new ArrayList();
		System.out.println("Hola Mundo");
		while (true){
			listaFloats.add(1.0); //8 bytes
			n++;
			System.out.println(n);
		}
		//-Xmx = 5 mb   ==> 240087
		//-Xmx = 2 mb   ==> 240087
		//-Xmx = 10 mb  ==> 482843
	}

}
