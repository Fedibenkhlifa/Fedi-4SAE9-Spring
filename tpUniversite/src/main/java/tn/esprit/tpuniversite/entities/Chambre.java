package tn.esprit.tpuniversite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name = "Chambre")

public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private String nomChambre;
    private TypeChambre typeC;

    // Constructeurs, getters et setters

    public Chambre() {}

    public Chambre(String nomChambre, TypeChambre typeC) {
        this.nomChambre = nomChambre;
        this.typeC = typeC;
    }

    // Getters et Setters

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public String getNomChambre() {
        return nomChambre;
    }

    public void setNomChambre(String nomChambre) {
        this.nomChambre = nomChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}