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

public class UniversiteServiceimpl implements IUniversiteService {
    UniversiteRepository unr;
    FoyerRepository Foy;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return unr.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return unr.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return unr.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return unr.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        unr.deleteById(idUniversite);

    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite = unr.findByNomUniversite(nomUniversite).get();
        Foyer foyer = Foy.findById(idFoyer).get();
        universite.setFoyer(foyer);
        return unr.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = unr.findById(idUniversite).get();
        universite.setFoyer(null);
        return unr.save(universite);
    }


}
