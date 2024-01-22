package models;

public class Motor {

    private String nombre;
    private double cilindrada;
    private String combustible;
    private double potencia;

    public Motor(){}

    public Motor(String nombre, double cilindrada, String combustible, double potencia) {
        this.nombre = nombre;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
