package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(name = "id_Usuarios")
    Integer userId;

    @Column(name = "nombre_Usuario")
    String userName;

    @Column(name = "contraseña")
    String pass;

    @Column(name = "perfil")
    String profile;
}
