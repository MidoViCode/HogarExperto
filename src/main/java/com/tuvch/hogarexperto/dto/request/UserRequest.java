package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequest {

    // String username; -> se declara así si tienen el mismo nombre

    @JsonProperty("id_usuari")
    int userId;

    @JsonProperty("personal_data")
    PersonalData personalData;

    @JsonProperty("cedula")
    String professionalLicense;

    @JsonProperty("turno")
    String shift;

    String password;

//    PatientEntity patientEntity;


}
