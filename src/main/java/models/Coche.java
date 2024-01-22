package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="vehiculo")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String marca;
    private String modelo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "motor_id", nullable = false)
    private Motor motor;
    private Double precio;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ficha_tecnica_id", referencedColumnName = "id")
    private Ficha_Tecnica fichaTecnica;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "coche_accesorio",
            joinColumns = @JoinColumn(name = "coche_id"),
            inverseJoinColumns = @JoinColumn(name = "accesorio_id")
    )
    private Set<Accesorio> accesorios;


}
