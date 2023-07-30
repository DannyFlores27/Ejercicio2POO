public class Vehiculo {
  private int id;
  private String marca;
  private String modelo;

  public Vehiculo(int id, String marca, String modelo) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
  }

  // Getters y Setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
}