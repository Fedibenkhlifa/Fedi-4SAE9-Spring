package tn.esprit.tpuniversite.services;

import tn.esprit.tpuniversite.entities.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
    Bloc affecterChambresABloc(List<Long> idChambre, long idBloc);
}
