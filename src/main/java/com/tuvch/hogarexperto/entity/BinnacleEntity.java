package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bitacora")
@Getter
@Setter
public class BinnacleEntity {

    @Id
    @Column(name = "id_bitacora")
    Integer binnacleId;

    @Column(name = "fecha")
    Date date;

    @Column(name = "valor")
    String value;

    @OneToOne
    @JoinColumn(name = "id_tipoBit")
    BinnacleTypeEntity binnacleTypeEntity;

    @OneToOne
    @JoinColumn(name = "id_paciente")
    PatientEntity patientId;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    UserEntity userId;
}
