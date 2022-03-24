package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(name = "id_usuari")
    Integer userId;

    @Column(name = "nombre")
    String userName;

    @Column(name = "ap_Paterno")
    String lastName;

    @Column(name = "ap_Materno")
    String motherLastName;

    @Column(name = "telefono")
    String phone;

    @Column(name = "fecha_Nacimiento")
    Date birthday;

    @Column(name = "sexo")
    String gender;

    @Column(name = "direccion")
    String adress;

    @Column(name = "correo")
    String email;

    @Column(name = "cedula")
    String professionalLicense;

    @Column(name = "turno")
    String shift;

    @Column(name = "password")
    String pass;

    @OneToOne
    @JoinColumn(name = "id_rolee")
    PatientEntity patientEntity;

}
