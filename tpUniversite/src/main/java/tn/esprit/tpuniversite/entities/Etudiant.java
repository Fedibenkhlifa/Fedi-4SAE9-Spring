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
@Table(name = "Etudiant")

public class Etudiant implements Serializable {

    @Getter
    @Id
    private Long idEtudiant;
    @Getter
    private String nomEt;
    @Getter
    private String prenomEt;
    @Getter
    private Long cin;
    @Getter
    private String ecole;
    @Getter
    private Date dateNaissance;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    // Constructeurs, getters et setters

    public Etudiant() {}

    public Etudiant(Long idEtudiant, String nomEt, String prenomEt, Long cin, String ecole, Date dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecole = ecole;
        this.dateNaissance = dateNaissance;
    }

    // Getters et Setters

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}