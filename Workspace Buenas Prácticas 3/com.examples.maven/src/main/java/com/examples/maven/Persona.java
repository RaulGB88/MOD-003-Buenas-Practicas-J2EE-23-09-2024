package com.examples.maven;

public class Persona implements Comparable<Persona>{

	int id;
	String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int compareTo(Persona o) {
		 
		return this.id >= o.id ? 0: 1;
	}
	
	
	
	
}
