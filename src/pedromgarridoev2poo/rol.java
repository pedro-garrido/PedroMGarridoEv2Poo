package pedromgarridoev2poo;

public class rol {

  private String user;
  private String contra;
  private String tipo;

  //constructor
  public rol(String user, String contra, String tipo) {
    this.user = user;
    this.contra = contra;
    this.tipo = tipo;
  }

  public String getUser() {
    return user;
  }

  public String getContra() {
    return contra;
  }

  public String getTipo() {
    return tipo;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void setContra(String contra) {
    this.contra = contra;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
