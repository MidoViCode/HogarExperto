package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native", strategy = "native")

    @Column(name = "id_paciente")
    Integer patientId;
    @Column(name = "nombre")
    String name;

    @Column(name = "ap_Paterno")
    String lastName;

    @Column(name = "ap_Materno")
    String middleName;

    @Column(name = "fecha_Nacimiento")
    Date birthday;

    @Column(name = "genero")
    String gender;

    @Column(name = "telefono")
    String phone;

    @Column(name = "direccion")
    String adress;

    @Column(name = "grupo_sanguineo")
    String blood;

    @Column(name = "info")
    String info;

}
