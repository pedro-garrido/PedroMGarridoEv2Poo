package pedromgarridoev2poo;

public class trabajador {

  private String nombre;
  private int edad;
  private int sueldo;
  private String cargo;
  private String ciudad;

  //constructor
  public trabajador(
    String nombre,
    int edad,
    int sueldo,
    String cargo,
    String ciudad
  ) {
    this.nombre = nombre;
    this.edad = edad;
    this.sueldo = sueldo;
    this.cargo = cargo;
    this.ciudad = ciudad;
  }

  //getters
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public int getSueldo() {
    return sueldo;
  }

  public String getCargo() {
    return cargo;
  }

  public String getCiudad() {
    return ciudad;
  }

  //setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
}
