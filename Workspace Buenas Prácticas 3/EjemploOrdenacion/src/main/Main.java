package main;

import java.util.Arrays;

import modelo.TipoPersona;

public class Main {

	
	public void metodoOrdenacion(){
		///............
	}
	
	public static void main(String[] args) {
		
	//opción clásica, inicial
		
		//1.- obtenemos datos
		//2.- llamamos al metodo metodoOrdenacion
		//3.- mostramos los datos ordenados
		
		
		//Datos simples*********************************
//		int listaNumeros[]=new int[]{5,3,8,1,3,4,9,0,10};
////		
//		System.out.println("Lista desordenada");
//		for (int i=0; i<listaNumeros.length;i++){
//			System.out.println(listaNumeros[i]);
//		}
////	
//		System.out.println("\n\nLista ordenada");
//		Arrays.sort(listaNumeros);
//		for (int i=0; i<listaNumeros.length;i++){
//			System.out.println(listaNumeros[i]);
//		}
		
		
		
		//Datos complejos*********************************
		TipoPersona p1, p2, p3;
//		
		p1=new TipoPersona(10, "Juan", "Moreno");
		p2=new TipoPersona(5,"Emilio", "Caballero");
		p3=new TipoPersona(7, "Alberto","Doe");
//		
//		
		System.out.println("Lista de personas desordenadas");
		TipoPersona listaPersonas[]=new TipoPersona[]{p1,p2,p3};
//		
//		
		for (int i=0; i<listaPersonas.length;i++){
			System.out.println(listaPersonas[i].getId()+":"+listaPersonas[i].getNombre());
		}
		Arrays.sort(listaPersonas);
//		
		System.out.println("\n\nLista de personas ordenadas");
		for (int i=0; i<listaPersonas.length;i++){
			System.out.println(listaPersonas[i].getId()+":"+listaPersonas[i].getNombre());
		}
		
	}

}
