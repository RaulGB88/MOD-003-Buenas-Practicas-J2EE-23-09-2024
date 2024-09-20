package com.examples.maven;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainOrdenacion {

	public static void main(String[] args) {
		 
		
		int[] listaElementos=new int[]{8,4,1,9,10,7,-15};
		
		
		Arrays.sort(listaElementos);
		
		for (int i=0;i<listaElementos.length;i++){
			System.out.println(listaElementos[i]);
		}
		
		
		System.out.println("\n\nComparando una lista de personas \n\n");
		Persona p1,p2,p3;
		p1=new Persona();
		p1.setId(1);
		p1.setNombre("Emilio");
		
		p2=new Persona();
		p2.setId(10);
		p2.setNombre("Jose");
		
		
		p3=new Persona();
		p3.setId(7);
		p3.setNombre("Juan");
		
		ArrayList<Persona> listaPersonas=new ArrayList();
		listaPersonas.add(p3);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		Collections.sort(listaPersonas);
		
		
		
		
		
		for (int i=0;i<listaPersonas.size();i++){
			System.out.println(listaPersonas.get(i).getId());
		}
		
		
		
		System.out.println("\n\nComparando una lista de personas 2\n\n");
		Persona[] listaPersonas2=new Persona[]{p3,p1,p2};
		Arrays.sort(listaPersonas2);
		for (int i=0;i<listaPersonas2.length;i++){
			System.out.println(listaPersonas2[i].getId());
		}
		
		

	}

}
