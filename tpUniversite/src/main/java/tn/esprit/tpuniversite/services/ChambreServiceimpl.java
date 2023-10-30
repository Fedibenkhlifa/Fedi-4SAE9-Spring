package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.repositories.ChambreRepository;

@Service
@AllArgsConstructor

public class ChambreServiceimpl implements  IChambreService{
    ChambreRepository CH ;
}
