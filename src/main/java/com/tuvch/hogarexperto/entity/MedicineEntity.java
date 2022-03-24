package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "medicamentos")
@Getter
@Setter

public class MedicineEntity {
    @Id
    @Column(name = "idMedicamentos")
    Integer medicineId;

    @Column(name = "nombre")
    String description;

    @Column(name = "viaAdministración")
    String routeAdministration;

    @Column(name = "fechaCaducidad")
    Date expiryDate;

    @Column(name = "dosisFarmaceutica")
    String pharmaceuticalDose;

    @Column(name = "indicacionesUso")
    String indicationsUse;

}
