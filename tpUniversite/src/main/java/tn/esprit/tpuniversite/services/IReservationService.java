package tn.esprit.tpuniversite.services;

import tn.esprit.tpuniversite.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();

    Reservation addReservations(Reservation r);

    Reservation updateReservations(Reservation r);


    Reservation retrieveReservations(String idReservation);


    void removeReservation(String idReservation);

}
