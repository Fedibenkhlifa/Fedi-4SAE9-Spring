package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Chambre;
import tn.esprit.tpuniversite.repositories.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class ChambreServiceimpl implements  IChambreService{
    ChambreRepository CH ;

    @Override
    public List<Chambre> retrieveAllChambre() {

        return CH.findAll();
    }


    @Override
    public Chambre addChambre(Chambre c) {

        return CH.save(c) ;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return CH.save(c);

    }

    @Override
    public Optional<Chambre> retrieveChambre(Long idChambre) {

        return CH.findById(idChambre);
    }

    @Override
    public void removeChambre(Long idChambre) {

    }
    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        return CH.findByBloc_NomBloc(nomBloc);
    }


    @Scheduled(fixedRate = 60000)
    public void pourcentageChambresParTypeChambre() {
        System.out.println("Service planifié : Pourcentage des chambres par type de chambre:");

        List<Object[]> pourcentageChambres = CH.getPourcentageChambresParTypeChambre();

        for (Object[] result : pourcentageChambres) {
            Chambre.TypeChambre typeChambre = (Chambre.TypeChambre) result[0];
            Double pourcentage = (Double) result[1];

            System.out.println("Type de chambre : " + typeChambre + ", Pourcentage : " + pourcentage + "%");
        }
    }
    @Scheduled(fixedRate = 60000)
    public void nbPlacesDisponiblesParChambreAnneeEnCours() {
        System.out.println("Service planifié : Nombre de places disponibles par chambre pour l'année en cours:");

        List<Object[]> placesDisponibles = CH.getNbPlacesDisponiblesParChambreAnneeEnCours();

        for (Object[] result : placesDisponibles) {
            Long numeroChambre = (Long) result[0];
            Long placesDispo = (Long) result[1];

            System.out.println("Chambre " + numeroChambre + " : " + placesDispo + " places disponibles");
        }
    }

    @Override
    public long nbrChambreParTypeEtBloc(Chambre.TypeChambre type, long idBloc) {
        return CH.countByTypeChambreAndBloc_IdBloc(type, idBloc);
    }
}
