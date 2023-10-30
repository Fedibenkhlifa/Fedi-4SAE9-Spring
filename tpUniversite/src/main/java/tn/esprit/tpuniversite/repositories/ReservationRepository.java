package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String>
{
}
