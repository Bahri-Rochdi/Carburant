package com.carburant.controleurs;

import com.carburant.entities.Fiche_Filtration_carburant;
import com.carburant.service.Fiche_Filtration_carburant_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fiche_filtration_carbuarant")
public class Fiche_Filtration_carburant_controler {
    @Autowired
    private Fiche_Filtration_carburant_service ficheFiltrationCarburantService;

    // 🔹 CREATE
    @PostMapping("/create")
    public Fiche_Filtration_carburant create(@RequestBody Fiche_Filtration_carburant ficheFiltrationCarburant) {
        return ficheFiltrationCarburantService.create_FFC(ficheFiltrationCarburant);
    }
    // 🔹 CREATE LIST
    @PostMapping("/createList")
    public List<Fiche_Filtration_carburant> createList(@RequestBody List<Fiche_Filtration_carburant> fiches) {
        return ficheFiltrationCarburantService.createList(fiches);
    }

    // 🔹 READ ALL
    @GetMapping("/findAll")
    public List<Fiche_Filtration_carburant> getAll() {
        return ficheFiltrationCarburantService.findAll_FFC();
    }

    // 🔹 READ BY ID
    @GetMapping("/{id}")
    public Optional<Fiche_Filtration_carburant> getById(@PathVariable Long id) {
        return ficheFiltrationCarburantService.findById_FFC(id);
    }

    // 🔹 UPDATE
    @PutMapping("/update/{id}")
    public Fiche_Filtration_carburant update(@PathVariable Long id, @RequestBody Fiche_Filtration_carburant ficheDetails) {
        return ficheFiltrationCarburantService.update_FFC(id, ficheDetails);
    }

    // 🔹 DELETE
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return ficheFiltrationCarburantService.delete_FFC(id);

    }


}
