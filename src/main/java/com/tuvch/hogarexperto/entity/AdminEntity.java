package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="administrador")
@Getter
@Setter
public class AdminEntity {
    @Id
    @Column(name="id_Administrador")
    Integer adminId;

    @Column(name="Nombre")
    String name;

    @Column(name="Ap_Paterno")
    String lastName;

    @Column(name="Ap_Materno")
    String motherLastName;

    @Column(name = "fecha_Nacimiento")
    Date birthdate;

    @OneToOne
    @JoinColumn(name = "id_Usuarios")
    UserEntity userEntity;
}
