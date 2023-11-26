package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Etudiant;
import tn.esprit.tpuniversite.entities.Reservation;
import tn.esprit.tpuniversite.repositories.EtudiantRepository;
import tn.esprit.tpuniversite.repositories.ReservationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor


public class EtudiantServiceimpl implements IEtudiantService{

    EtudiantRepository etr ;
    ReservationRepository reservationRepository;

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
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation){


        Reservation reservation = reservationRepository.findById(idReservation).get();
        Etudiant etudiant = etr.findByNomEtAndPrenomEt(nomEt, prenomEt) ;
            reservation.getEtudiants().add(etudiant);
reservation.getEtudiants().add(etudiant);
            reservationRepository.save(reservation);

            return etudiant;
        }
    }



