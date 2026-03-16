package com.carburant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fiche_filtration_carburant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fiche_Filtration_carburant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long m_ffc;

    @Column(name = "code_y_ffc")
    private String code_y_ffc;

    @Column(name = "code_z_ffc")
    private String code_z_ffc;

    @Column(name = "code_mois_ffc")
    private String code_mois_ffc;

    @Column(name = "code_annee_ffc")
    private String code_annee_ffc;

    @Column(name = "code_incremental_ffc")
    private String code_incremental_ffc;

    @Column(name = "nom_responsable_ffc")
    private String nom_responsable_ffc;
}
