package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>
{

}
