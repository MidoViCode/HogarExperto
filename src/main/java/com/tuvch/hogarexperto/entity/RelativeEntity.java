package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="familiar")
@Getter
@Setter

public class RelativeEntity {
    @Id
    @Column(name = "id_Familiar")
    Integer relativeId;

    @Column(name="nombre")
    String name;

    @Column(name="ap_Paterno")
    String lastName;

    @Column(name="ap_Materno")
    String motherLastName;

    @Column(name = "fecha_Nacimiento")
    Date birthdate;

    @Column(name = "direccion")
    String adress;

    @Column(name = "telefono")
    String phone;

    @Column(name = "correo")
    String email;

    @Column(name = "num_INE")
    String ine;

    @Column(name = "parentezco")
    String kinship;

    @Column(name = "grupo_Sanguineo")
    String blood;

}
