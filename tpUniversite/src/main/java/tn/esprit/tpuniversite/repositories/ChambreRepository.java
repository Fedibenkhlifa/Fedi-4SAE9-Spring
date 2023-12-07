package tn.esprit.tpuniversite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.tpuniversite.entities.Chambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findByBloc_NomBloc(String nomBloc);


       // @Query("SELECT c.nomChambre FROM Chambre c WHERE c.bloc.nomBloc = :nomBloc")
        //List<String> findNomsByBloc_NomBloc(@Param("nomBloc") String nomBloc);


    long countByTypeChambreAndBloc_IdBloc(Chambre.TypeChambre type, long idBloc);
    List<Chambre> findByTypeChambre(Chambre.TypeChambre typeChambre);

    @Query("SELECT c.typeChambre, COUNT(c) * 100.0/(SELECT COUNT(*) FROM Chambre) FROM Chambre c GROUP BY c.typeChambre")
    List<Object[]> getPourcentageChambresParTypeChambre();
    @Query("SELECT c.NumeroChambre, (b.capaciteBloc - COUNT(r)) AS placesDisponibles " +
            "FROM Chambre c " +
            "JOIN c.bloc b " +
            "LEFT JOIN c.Reservations r " +
            "WHERE r.anneeUniversitaire = CURRENT_DATE AND r.estValide = true " +
            "GROUP BY c.NumeroChambre, b.capaciteBloc")
    List<Object[]> getNbPlacesDisponiblesParChambreAnneeEnCours();
}


