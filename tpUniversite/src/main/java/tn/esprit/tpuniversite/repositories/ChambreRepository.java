package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {


}