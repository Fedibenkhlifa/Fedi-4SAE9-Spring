package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpuniversite.services.IReservationService;
@RestController
@AllArgsConstructor
@RequestMapping("reservations")
public class ReservationController {
    IReservationService reservationService ;
}
