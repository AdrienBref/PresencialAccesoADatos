package models;

import java.util.Date;

public class Ficha_Tecnica {

    private Date fecha;
    private boolean itv;
    private char etiqueta;

    public Ficha_Tecnica(){}
    public Ficha_Tecnica(Date fecha, boolean itv, char etiqueta) {
        this.fecha = fecha;
        this.itv = itv;
        this.etiqueta = etiqueta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isItv() {
        return itv;
    }

    public void setItv(boolean itv) {
        this.itv = itv;
    }

    public char getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(char etiqueta) {
        this.etiqueta = etiqueta;
    }
}
