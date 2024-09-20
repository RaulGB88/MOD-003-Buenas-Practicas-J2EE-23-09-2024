package com.examples.maven;

public class MainCadenas {

	public static void main(String[] args) {


		String cadenaA="Esta es la cadena A";
		String cadenaB="Esta es la cadena A";
		
		
		if (cadenaA==cadenaB){
			System.out.println("cadenaA y cadenaB son iguales");
		}else{
			System.out.println("cadenaA y cadenaB son diferentes");
		}

		
		String cadenaA1=new String("Cadena A");
		String cadenaA2=new String("Cadena A");
		
		if (cadenaA1==cadenaA2){
			System.out.println("cadenaA1 y cadenaA2 son iguales");
		}else{
			System.out.println("cadenaA1 y cadenaA2 son diferentes");
		}
		
		//uso del equals
		if (cadenaA1.equals(cadenaA2)){
			System.out.println("cadenaA1 y cadenaA2 son iguales");
		}else{
			System.out.println("cadenaA1 y cadenaA2 son diferentes");
		}
		
		//uso del equalsIgnoreCase
		cadenaA1=new String("CADENA A");
		if (cadenaA1.equalsIgnoreCase(cadenaA2)){
			System.out.println("cadenaA1 y cadenaA2 son iguales");
		}else{
			System.out.println("cadenaA1 y cadenaA2 son diferentes");
		}
		
		int compare=cadenaA1.compareTo(cadenaA2);
		System.out.println("compare ==>"+compare);
		
		
		compare=cadenaA2.compareTo(cadenaA1);
		System.out.println("compare ==>"+compare);
		
		
		cadenaA1=new String("Cadena A");
		compare=cadenaA1.compareTo(cadenaA2);
		System.out.println("compare ==>"+compare);
	}

}
