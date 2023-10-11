package tn.esprit.tpuniversite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    @Getter
    private String nomBloc;
    @Getter
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;
    @OneToMany (mappedBy = "bloc", cascade = CascadeType.ALL)
    private Set<Chambre> chambres;


    public Bloc() {}

    public Bloc(String nomBloc, Long capaciteBloc) {
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }

    // Getters et Setters

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
}