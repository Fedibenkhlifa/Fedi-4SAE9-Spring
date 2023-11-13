package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Bloc;
import tn.esprit.tpuniversite.entities.Chambre;
import tn.esprit.tpuniversite.repositories.BlocRepository;
import tn.esprit.tpuniversite.repositories.ChambreRepository;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceimpl implements IBlocService{
    BlocRepository br ;
    ChambreRepository cr;

    @Override
    public List<Bloc> retrieveAllBloc() {
        return br.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return br.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return br.save(b) ;
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return br.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        br.deleteById(idBloc);

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc = br.findById(idBloc).get();
        List<Chambre> chambres = cr.findAllById(numChambre);
        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);
        }

        bloc.setChambres(new HashSet<>(chambres));

        return br.save(bloc);

    }


}
