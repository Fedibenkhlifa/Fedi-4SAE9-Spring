package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Etudiant;
import tn.esprit.tpuniversite.repositories.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor


public class EtudiantServiceimpl implements IEtudiantService{

    EtudiantRepository etr ;

    @Override
    public List <Etudiant> retrieveAllEtudiants() {
        return etr.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etr.save(e) ;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etr.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etr.findById(idEtudiant).get();
    }
    @Override
    public void removeEtudiant(Long idEtudiant) {
    etr.deleteById(idEtudiant);    }

    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        List<Etudiant> addedEtudiants = new ArrayList<>();

        for (Etudiant e : etudiants) {
            Etudiant addedEtudiant = etr.save(e);
            addedEtudiants.add(addedEtudiant);
        }

        return addedEtudiants;
    }
    }

