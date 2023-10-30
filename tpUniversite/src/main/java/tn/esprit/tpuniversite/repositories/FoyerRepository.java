package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Foyer;

@Repository

public interface FoyerRepository extends JpaRepository<Foyer, Long>{
}
