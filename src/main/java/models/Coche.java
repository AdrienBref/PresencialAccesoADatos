package models;

public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Double precio;
    private Ficha_Tecnica fichaTecnica;
    private Accesorio accesorio;

    public Coche(){}

    public Coche(String marca, String modelo, Motor motor, Double precio, Ficha_Tecnica fichaTecnica, Accesorio accesorio) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.fichaTecnica = fichaTecnica;
        this.accesorio = accesorio;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Ficha_Tecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(Ficha_Tecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }
}
