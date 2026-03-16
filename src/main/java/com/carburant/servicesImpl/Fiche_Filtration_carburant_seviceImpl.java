package com.carburant.servicesImpl;

import com.carburant.entities.Fiche_Filtration_carburant;
import com.carburant.repositories.Fiche_Filtration_carburant_repository;
import com.carburant.service.Fiche_Filtration_carburant_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Fiche_Filtration_carburant_seviceImpl implements Fiche_Filtration_carburant_service {

    @Autowired
    private Fiche_Filtration_carburant_repository ficheFiltrationCarburantRepository;

    @Override
    public Fiche_Filtration_carburant create_FFC(Fiche_Filtration_carburant ficheFiltrationCarburant) {
        return ficheFiltrationCarburantRepository.save(ficheFiltrationCarburant);
    }

    public List<Fiche_Filtration_carburant> createList(List<Fiche_Filtration_carburant> fiches) {
        return ficheFiltrationCarburantRepository.saveAll(fiches);
    }

    @Override
    public List<Fiche_Filtration_carburant> findAll_FFC() {
        return ficheFiltrationCarburantRepository.findAll();
    }

    @Override
    public Optional<Fiche_Filtration_carburant> findById_FFC(long id_FFC) {
        return ficheFiltrationCarburantRepository.findById(id_FFC);
    }
    public Fiche_Filtration_carburant update_FFC(Long id, Fiche_Filtration_carburant newData) {
        Fiche_Filtration_carburant ficheFiltrationCarburant = ficheFiltrationCarburantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fiche non trouvée avec id : " + id));

        ficheFiltrationCarburant.setCode_y_ffc(newData.getCode_y_ffc());
        ficheFiltrationCarburant.setCode_z_ffc(newData.getCode_z_ffc());
        ficheFiltrationCarburant.setCode_mois_ffc(newData.getCode_mois_ffc());
        ficheFiltrationCarburant.setCode_annee_ffc(newData.getCode_annee_ffc());
        ficheFiltrationCarburant.setCode_incremental_ffc(newData.getCode_incremental_ffc());
        ficheFiltrationCarburant.setNom_responsable_ffc(newData.getNom_responsable_ffc());

        return ficheFiltrationCarburantRepository.save(ficheFiltrationCarburant);
    }

    public boolean delete_FFC(Long id) {

        if (ficheFiltrationCarburantRepository.existsById(id)) {
            ficheFiltrationCarburantRepository.deleteById(id);
            return true;
        } else {
            new RuntimeException("Fiche non trouvée avec id : " + id);
            return false;
        }
    }
}
