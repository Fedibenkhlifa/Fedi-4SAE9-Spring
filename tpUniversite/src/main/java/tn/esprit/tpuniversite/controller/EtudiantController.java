package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Etudiant;
import tn.esprit.tpuniversite.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiants")
public class EtudiantController {
    IEtudiantService etudiantService ;
    @GetMapping("getAllEtudiants")
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId){
        etudiantService.removeEtudiant(etudiantId);
    }
    @PostMapping("/add-etudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        List<Etudiant> addedEtudiants = etudiantService.addEtudiants(etudiants);
        return addedEtudiants;
    }

}
