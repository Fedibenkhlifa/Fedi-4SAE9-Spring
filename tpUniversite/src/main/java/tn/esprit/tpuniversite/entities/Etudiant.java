package tn.esprit.tpuniversite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private  String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Reservation> reservations;
}