package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Universite;
import tn.esprit.tpuniversite.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class UniversiteServiceimpl implements IUniversiteService{
    UniversiteRepository unr ;
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
}
