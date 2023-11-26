package tn.esprit.tpuniversite.services;

import tn.esprit.tpuniversite.entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {

        List<Chambre> retrieveAllChambre();

        Chambre addChambre(Chambre c);

        Chambre updateChambre(Chambre c);

        Optional<Chambre> retrieveChambre(Long idChambre);

        void removeChambre(Long idChambre);
        List<Chambre> getChambresParNomBloc(String nomBloc);
        long nbrChambreParTypeEtBloc(Chambre.TypeChambre type, long idBloc);

}


