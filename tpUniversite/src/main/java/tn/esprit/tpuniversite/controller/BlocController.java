package tn.esprit.tpuniversite.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpuniversite.entities.Bloc;
import tn.esprit.tpuniversite.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("blocs")
public class BlocController {
    IBlocService blocService ;
    @GetMapping("getAllBlocs")
    public List<Bloc> getAllBlocs(){
        return blocService.retrieveAllBloc();
    }
    @PostMapping("/add-bloc")
    public Bloc addBlocs(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    @PutMapping("/update-bloc")
    public Bloc updateBody(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{blo-id}")
    public void removeFoyer(@PathVariable("bloc-id") Long idBloc){
        blocService.removeBloc(idBloc);
    }
    @PostMapping("/affecter-chambres-au-bloc/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> idChambres, @PathVariable("idBloc") long idBloc) {
        return blocService.affecterChambresABloc(idChambres, idBloc);
    }
}
