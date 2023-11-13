package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Universite;
import tn.esprit.tpuniversite.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("universite")
public class UniversiteController {
    IUniversiteService universiteService ;

    @GetMapping("getAllUniversite")
    public List<Universite> getAllUniversites(){
        return universiteService.retrieveAllUniversites();
    }
    @PostMapping("/add-universite")
    public Universite addUniversites(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }

    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long idUniversite ){
        universiteService.removeUniversite(idUniversite);
    }
    @PutMapping("/affecterFoyerAUniversite/{nomUniversite}/{idFoyer}")
    public void assignFoyerToUniversite(@PathVariable("nomUniversite") String nomUniversite,
                                             @PathVariable("idFoyer") Long idFoyer) {
        universiteService.affecterFoyerAUniversite(idFoyer , nomUniversite);
    }
    @PutMapping("/desaffecterFoyerAUniversite/{idUniversite}")
    public void disallowFoyerToUniversite(@PathVariable("idUniversite") Long idUniversite) {
        universiteService.desaffecterFoyerAUniversite(idUniversite );
    }

}
