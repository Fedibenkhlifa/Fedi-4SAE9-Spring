package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Chambre;
import tn.esprit.tpuniversite.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambres")
public class ChambreController {
    IChambreService chambreService;

    @GetMapping("getAllChambres")
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambre();
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }

    @GetMapping("/by-bloc/{nomBloc}")
    public List<Chambre> getChambresParNomBloc(@PathVariable String nomBloc) {
        List<Chambre> chambres = chambreService.getChambresParNomBloc(nomBloc);
        return chambres;
    }

    @GetMapping("/count-by-type-and-bloc/{type}/{idBloc}")
    public long nbrChambreParTypeEtBloc(@PathVariable Chambre.TypeChambre type, @PathVariable long idBloc) {
        long count = chambreService.nbrChambreParTypeEtBloc(type, idBloc);
        return count;
    }
}
