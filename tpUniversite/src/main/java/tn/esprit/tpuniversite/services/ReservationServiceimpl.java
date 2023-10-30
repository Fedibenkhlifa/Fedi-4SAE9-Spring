package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.repositories.ReservationRepository;

@Service
@AllArgsConstructor

public class ReservationServiceimpl implements IReservationService{
    ReservationRepository Res ;
}
