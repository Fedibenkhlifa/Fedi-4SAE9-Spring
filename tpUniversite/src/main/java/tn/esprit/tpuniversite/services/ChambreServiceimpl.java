package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Bloc;
import tn.esprit.tpuniversite.entities.Chambre;
import tn.esprit.tpuniversite.repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class ChambreServiceimpl implements  IChambreService{
    ChambreRepository CH ;

    @Override
    public List<Bloc> retrieveAllChambre() {
        return null;
    }

    @Override
    public Bloc addChambre(Chambre c) {
        return null;
    }

    @Override
    public Bloc updateBloc(Chambre c) {
        return null;
    }

    @Override
    public Bloc retrieveChambre(Long idChambre) {
        return null;
    }

    @Override
    public void removeBloc(Long idChambre) {

    }
}
