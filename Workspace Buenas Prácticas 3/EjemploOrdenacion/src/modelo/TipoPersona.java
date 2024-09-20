package modelo;

public class TipoPersona implements Comparable<TipoPersona>{
	
	int id;
	String nombre;
	String apellidos;

	public TipoPersona(int id, String name, String ap) {
		this.id = id;
		this.nombre = name;
		this.apellidos = ap;
	}

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

//	@Override
//	public int compareTo(TipoPersona arg0) {
//		 
//		//return this.id - arg0.getId(); //5,7,10
//		return  arg0.getId() - this.id; //10,7,5
//	}

	// @Override
	// public String toString() {
	// // TODO Auto-generated method stub
	// return id ;
	// }

	@Override
	public int compareTo(TipoPersona arg0) {

		int lastCmp = this.nombre.compareTo(arg0.getNombre());
		//return (lastCmp != 0 ? lastCmp : this.nombre.compareTo(arg0.getNombre()));   //Ascendente
		return (lastCmp != 0 ?  0:this.nombre.compareTo(arg0.getNombre()) ); 

	}

	// @Override
	// public int compareTo(TipoPersona arg0) {
	//
	//
	// return this.id-arg0.getId();
	//
	// }

}
