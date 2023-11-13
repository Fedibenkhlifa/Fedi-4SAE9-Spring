package tn.esprit.tpuniversite.services;

import tn.esprit.tpuniversite.entities.Bloc;
import tn.esprit.tpuniversite.entities.Chambre;

import java.util.List;

public interface IChambreService {

        List<Bloc> retrieveAllChambre();

        Bloc addChambre(Chambre c);

        Bloc updateBloc(Chambre c);

        Bloc retrieveChambre(Long idChambre);

        void removeBloc(Long idChambre);

    }


