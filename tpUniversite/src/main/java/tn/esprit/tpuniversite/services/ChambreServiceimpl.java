package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
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
    @Override
    public long nbrChambreParTypeEtBloc(Chambre.TypeChambre type, long idBloc) {
        return CH.countByTypeChambreAndBloc_IdBloc(type, idBloc);
    }
}
