package tn.esprit.tpuniversite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Chambre implements Serializable {
    public enum TypeChambre { SIMPLE, DOUBLE, TRIPLE };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idChambre;
    private long NumeroChambre;
    @Enumerated(EnumType.STRING)

    private TypeChambre typeChambre;
    @ManyToOne
    @JsonIgnore
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;
}
