package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="accesorio")
public class Accesorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String nombre;
    private String descripción;
    private double precio;
    @ManyToMany(mappedBy = "accesorios")
    private Set<Coche> coches;

    public Accesorio(String nombre, String descripción, double precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
    }
}
