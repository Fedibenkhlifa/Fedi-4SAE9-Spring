package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.entities.Bloc;
import tn.esprit.tpuniversite.entities.Chambre;
import tn.esprit.tpuniversite.repositories.BlocRepository;
import tn.esprit.tpuniversite.repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceimpl implements IBlocService {
    BlocRepository br;
    ChambreRepository CH;

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
        return br.save(b);
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
    public Bloc affecterChambresABloc(List<Long> idChambres, long idBloc) {
        // Récupérer le bloc
        Bloc bloc = br.findById(idBloc).get();

        // Récupérer les chambres par leurs identifiants
        List<Chambre> chambreList = (List<Chambre>)CH.findAllById(idChambres);

      for (Chambre chambre:chambreList){
          chambre.setBloc(bloc);
          br.save(bloc);
      }
        br.save(bloc);

        return bloc;
    }
}
