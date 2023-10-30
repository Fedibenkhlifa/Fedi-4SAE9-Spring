package tn.esprit.tpuniversite.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpuniversite.repositories.BlocRepository;

@Service
@AllArgsConstructor
public class BlocServiceimpl implements IBlocService{
    BlocRepository b ;
}
