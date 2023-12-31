package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Foyer;
import tn.esprit.tpuniversite.entities.Universite;
import tn.esprit.tpuniversite.repositories.FoyerRepository;
import tn.esprit.tpuniversite.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerServiceimpl implements IFoyerService {
    FoyerRepository Foy;
    UniversiteRepository unr;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return Foy.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return Foy.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return Foy.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return Foy.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        Foy.deleteById(idFoyer);

    }

    @Override
    public void archiverFoyer(long idFoyer) {
        Foyer foyer = Foy.findById(idFoyer).orElse(null);
        if(foyer!=null) {
            foyer.setArchive(true);
            Foy.save(foyer);
        }
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Foyer foyerNv = Foy.save(foyer);
        Universite universite = unr.findById(idUniversite).get();
        universite.setFoyer(foyerNv);
        unr.save(universite);
        return foyerNv;


    }


}