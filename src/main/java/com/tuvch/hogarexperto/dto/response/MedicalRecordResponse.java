package com.tuvch.hogarexperto.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MedicalRecordResponse {
    @JsonProperty("fecha_ingreso")
    Date admissionDate;

    @JsonProperty("modalidad")
    String modality;

    @JsonProperty("peso")
    float weight;

    @JsonProperty("CURP")
    String CURP;

    @JsonProperty("ant_cronicas")
    String chronic;

    @JsonProperty("ant_alergias")
    String alergic;

    @JsonProperty("ant_traumatologicos")
    String traumatology;

    @JsonProperty("ant_convulsiones")
    String seizures;

    @JsonProperty("ant_quirurgicos")
    String surgical;

    @JsonProperty("id_medicinas")
    int medicines;

    @JsonProperty("talla")
    float size;

    public static MedicalRecordResponse buildMock(){
        return MedicalRecordResponse.builder()
                .CURP("VIMNBASAJN3242MNS02")
                .weight(52.2F)
                .size(1.58F)
             //   .admissionDate(24/03/2022)
                .alergic("Negadas")
                .chronic("artritis")
                .modality("Tiempo Completo")
                .seizures("Negadas convulsiones")
                .surgical("ninguna")
                .traumatology("Clavos de titanio brazo derecho")
                .medicines(01)
                .build();

    }

}
