public class Pista {
  private int id;
  private String nombre;
  private double largo;

  // Contructor

  public Pista(int id, String nombre, double largo) {
    this.id = id;
    this.nombre = nombre;
    this.largo = largo;
  }

  // Getters y Setters

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

  public double getLargo() {
    return largo;
  }

  public void setLargo(double largo) {
    this.largo = largo;
  }
}