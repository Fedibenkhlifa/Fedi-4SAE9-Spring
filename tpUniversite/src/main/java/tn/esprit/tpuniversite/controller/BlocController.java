package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpuniversite.services.IBlocService;
@RestController
@AllArgsConstructor
@RequestMapping("blocs")
public class BlocController {
    IBlocService blocService ;
}
