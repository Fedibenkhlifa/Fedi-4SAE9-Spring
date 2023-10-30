package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Foyer;
import tn.esprit.tpuniversite.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyer")
public class FoyerController {
    IFoyerService foyerService ;
        @GetMapping("getAllFoyers")
        public List<Foyer> getAllFoyers(){
            return foyerService.retrieveAllFoyers();
        }
        @PostMapping("/add-foyer")
        public Foyer addFoyers(@RequestBody Foyer f) {
            Foyer foyer = foyerService.addFoyer(f);
            return foyer;
        }
        @PutMapping("/update-foyer")
        public Foyer updateFoyer(@RequestBody Foyer f) {
            Foyer foyer = foyerService.updateFoyer(f);
            return foyer;
        }
        @DeleteMapping("/remove-foyer/{foyer-id}")
        public void removeFoyer(@PathVariable("foyer-id") Long idFoyer){
            foyerService.removeFoyer(idFoyer);
        }
    @PostMapping("/archiver-foyer/{idFoyer}")
    public void archiverFoyer(@PathVariable("idFoyer") Long idFoyer) {
        foyerService.archiverFoyer(idFoyer);
    }

}
