package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Reservation;
import tn.esprit.tpuniversite.repositories.ChambreRepository;
import tn.esprit.tpuniversite.repositories.EtudiantRepository;
import tn.esprit.tpuniversite.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ReservationServiceimpl implements IReservationService{
    ReservationRepository Res ;
     EtudiantRepository etudiantRepository;
ChambreRepository CH ;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return Res.findAll();
    }

    @Override
    public Reservation addReservations(Reservation r) {
        return Res.save(r);
    }

    @Override
    public Reservation updateReservations(Reservation r) {
        return Res.save(r);
    }

    @Override
    public Reservation retrieveReservations(String idReservation) {
        return Res.findById(idReservation).get();
    }

    @Override
    public void removeReservation(String idReservation) {
    Res.deleteById(idReservation);
    }



}



