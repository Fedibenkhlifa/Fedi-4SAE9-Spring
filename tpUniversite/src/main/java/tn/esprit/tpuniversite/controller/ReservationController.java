package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Reservation;
import tn.esprit.tpuniversite.services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservations")
public class ReservationController {
    IReservationService reservationService ;

    @GetMapping("getAllReservations")
    public List<Reservation> getAllReservations(){
        return reservationService.retrieveAllReservations();
    }

    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservations(r);
        return reservation;
    }
    @PutMapping("/update-Reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.updateReservations(r);
        return reservation;
    }

    @DeleteMapping("/remove-Reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String idReservation ){
        reservationService.removeReservation(idReservation);
    }

}


