package tn.esprit.tpuniversite.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Chambre")
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilisation d'une clé générée automatiquement
    @Column(name = "idChambre")
    private Long idChambre;

    @Column(name = "numeroChambre")
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(name = "typeC")
    private TypeChambre typeC;

   @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;



    // Constructeurs, getters et setters

    public Chambre() {}

    public Chambre(Long numeroChambre, TypeChambre typeC) {
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
    }

    // Getters et setters

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}

