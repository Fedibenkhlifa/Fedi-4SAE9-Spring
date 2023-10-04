package tn.esprit.tpuniversite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "Reservation")

public class Reservation {

    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    // Constructeurs, getters et setters

    public Reservation() {}

    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    // Getters et Setters

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}

