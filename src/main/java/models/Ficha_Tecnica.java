package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="ficha")

public class Ficha_Tecnica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private Date fecha;
    private boolean itv;
    private char etiqueta;
    @OneToOne(mappedBy = "fichaTecnica")
    private Coche coche;

    public Ficha_Tecnica(Date fecha, boolean itv, char etiqueta) {
        this.fecha = fecha;
        this.itv = itv;
        this.etiqueta = etiqueta;
    }
}
