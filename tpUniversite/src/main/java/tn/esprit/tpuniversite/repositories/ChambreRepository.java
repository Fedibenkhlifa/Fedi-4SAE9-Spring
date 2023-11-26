package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Chambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findByBloc_NomBloc(String nomBloc);
    long countByTypeChambreAndBloc_IdBloc(Chambre.TypeChambre type, long idBloc);
}
