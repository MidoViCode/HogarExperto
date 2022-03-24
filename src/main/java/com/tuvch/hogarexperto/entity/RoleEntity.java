package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
@Getter
@Setter

public class RoleEntity {
    @Id
    @Column (name = "id_Rol")
    Integer roleId;

    @Column(name = "rol")
    String role;

    @Column(name = "permisos")
    String permission;

}
