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
@Entity(name="motor")
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String nombre;
    private double cilindrada;
    private String combustible;
    private double potencia;
    @OneToMany(mappedBy = "motor")
    private Set<Coche> coches;

    public Motor(String nombre, double cilindrada, String combustible, double potencia) {
        this.nombre = nombre;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
    }
}
