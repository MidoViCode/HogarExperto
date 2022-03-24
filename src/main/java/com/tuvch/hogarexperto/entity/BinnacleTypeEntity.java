package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipobitacora")
@Getter
@Setter

public class BinnacleTypeEntity {
    @Id
    @Column(name = "id_tipoBitacora")
    Integer kindBinnaId;

    @Column(name = "descripcion")
    String description;
}
