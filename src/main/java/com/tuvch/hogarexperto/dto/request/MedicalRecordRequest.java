package com.tuvch.hogarexperto.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MedicalRecordRequest {
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


}
