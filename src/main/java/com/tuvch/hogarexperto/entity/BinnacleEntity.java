package com.tuvch.hogarexperto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bitacora")
@Getter
@Setter
public class BinnacleEntity {

    @Id
    @Column(name = "id_bitacora")
    String binnacleId;

    @Column(name = "id_paciente")
    String patientId;
    @Column(name = "id_usuario")
    String userId;
    @Column(name = "peso")
    String weight;
    @Column(name = "talla")
    String size;
    @Column(name = "turno")
    String shift;
    @Column(name = "pulso")
    String pulse;
    @Column(name = "presion")
    String pressure;
    @Column(name = "temp")
    String temperature;
    @Column(name = "lavGenitales")
    String genitalWash;
    @Column(name = "duchaCompleta")
    String fullShower;
    @Column(name = "lavadoDientes")
    String wahsTeeth;
    @Column(name = "horaDormir")
    String sleepTime;
    @Column(name = "seLevanto")
    String getUp;
    @Column(name = "vecesLevanto")
    String timesGetUp;
    @Column(name = "comportamiento")
    String behavior;
    @Column(name = "numMiccion")
    String numMiction;
    @Column(name = "miccionObservacion")
    String mictionObservation;
    @Column(name = "numDefecacion")
    String numDefecation;
    @Column(name = "defecacionObservacion")
    String DefecObservation;
}
