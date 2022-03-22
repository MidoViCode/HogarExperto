package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientRequest {

    @JsonProperty("grupo_sanguineo")
    String blood;

    @JsonProperty("info")
    String info;

    @JsonProperty("personal_data")
    PersonalData personalData;
}
