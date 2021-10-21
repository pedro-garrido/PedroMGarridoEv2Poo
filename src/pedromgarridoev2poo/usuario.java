package pedromgarridoev2poo;

public class usuario extends acciones {
	public String nombre;
	public String rol;

	public usuario(String nombre, String rol){
		this.nombre=nombre;
		this.rol=rol;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRol() {
		return rol;
	}
}
