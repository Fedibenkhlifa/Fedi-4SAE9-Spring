package tn.esprit.tpuniversite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Long idUniversite;

    @Getter
    @Column(name = "nomUniversite")
    private String nomUniversite;

    @Getter
    @Column(name = "adresse")
    private String adresse;
   @OneToOne
   private Foyer foyer ;

    // Les getters et les setters

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}