package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.ArrayList;


import javax.persistence.*;

@Entity
@Table(name = "archivopaciente")
@Getter
@Setter
public class MedicalRecordEntity {

    @Id
    @Column(name = "fecha_ingreso")
    Date admissionDate;

    @Column(name = "modalidad")
    String modality;

    @Column(name = "peso")
    Float weight;

    @Column(name = "CURP")
    String CURP;

    @Column(name = "ant_cronicas")
    String chronic;

    @Column(name = "ant_alergias")
    String alergic;

    @Column(name = "ant_traumatologicos")
    String traumatology;

    @Column(name = "ant_convulsiones")
    String seizures;

    @Column(name = "ant_quirurgicos")
    String surgical;

    @Column(name = "medicinas")
    String medicines;

    @Column(name = "talla")
    Float size;

    @OneToOne
    @JoinColumn(name = "id_pacient")
    PatientEntity patientEntity;

    @OneToMany
    @JoinColumn(name = "id_familiar")
    List<RelativeEntity> relativeEntityList;


}
