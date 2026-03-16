package com.carburant.service;

import com.carburant.entities.Fiche_Filtration_carburant;

import java.util.List;
import java.util.Optional;

public interface Fiche_Filtration_carburant_service {

    public Fiche_Filtration_carburant create_FFC (Fiche_Filtration_carburant ficheFiltrationCarburant);
    public List<Fiche_Filtration_carburant> findAll_FFC();
    public Optional<Fiche_Filtration_carburant> findById_FFC (long id_FFC);
    public Fiche_Filtration_carburant update_FFC(Long id, Fiche_Filtration_carburant newData);
    public boolean delete_FFC(Long id);
    public List<Fiche_Filtration_carburant> createList(List<Fiche_Filtration_carburant> fiches);
}
