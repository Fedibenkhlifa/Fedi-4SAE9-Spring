package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
