package tn.esprit.tpuniversite.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")

public class Reservation implements Serializable {

    @Getter
    @Id
    private String idReservation;
    @Getter
    private Date anneeUniversitaire;
    @Getter
    private boolean estValide;


   @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


    // Constructeurs, getters et setters

    public Reservation() {}

    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    // Getters et Setters

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}

