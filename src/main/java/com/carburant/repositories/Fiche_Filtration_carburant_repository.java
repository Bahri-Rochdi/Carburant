package com.carburant.repositories;

import com.carburant.entities.Fiche_Filtration_carburant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Fiche_Filtration_carburant_repository extends JpaRepository<Fiche_Filtration_carburant, Long> {

}