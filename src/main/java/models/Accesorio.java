package models;

public class Accesorio {

    private String nombre;
    private String descripción;
    private double precio;

    public Accesorio() {
    }

    public Accesorio(String nombre, String descripción, double precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
