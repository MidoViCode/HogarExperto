package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminRequest {
    @JsonProperty("cedula")
    String professionalLicense;

    @JsonProperty("turno")
    String shift;

    @JsonProperty("password")
    String password;

    @JsonProperty("personal_data")
    PersonalData personalData;
    
}
