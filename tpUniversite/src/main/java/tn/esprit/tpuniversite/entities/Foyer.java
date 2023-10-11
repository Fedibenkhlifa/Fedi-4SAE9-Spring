package tn.esprit.tpuniversite.entities;

import jakarta.persistence.*;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Foyer")
public class Foyer implements Serializable {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    @Getter
    private String nomFoyer;
    @Getter
    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> Blocs;



    // Constructeurs, getters et setters

    public Foyer() {}

    public Foyer(String nomFoyer, Long capaciteFoyer) {
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    // Getters et Setters

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
}