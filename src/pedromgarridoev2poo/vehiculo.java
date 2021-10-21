package pedromgarridoev2poo;

public class vehiculo {

  private int ruedas;
  private int pasajeros;
  private String patente;
  private String motor;
  private String color;

  public vehiculo(
    int ruedas,
    int pasajeros,
    String patente,
    String motor,
    String color
  ) {
    this.ruedas = ruedas;
    this.pasajeros = pasajeros;
    this.patente = patente;
    this.motor = motor;
    this.color = color;
  }

  //getters
  public int getRuedas() {
    return ruedas;
  }

  public int getPasajeros() {
    return pasajeros;
  }

  public String getPatente() {
    return patente;
  }

  public String getMotor() {
    return motor;
  }

  public String getcolor() {
    return color;
  }

  //setters
  public void setRuedas(int ruedas) {
    this.ruedas = ruedas;
  }

  public void setPasajeros(int pasajeros) {
    this.pasajeros = pasajeros;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public void setMotor(String motor) {
    this.motor = motor;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void frenar() {
    System.out.println("vehiculo freno");
  }

  public void acelerar() {
    System.out.println("vehiculo acelero");
  }
}
