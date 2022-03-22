package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelativeRequest {
    String username;
    String password;

    @JsonProperty("num_INE")
    String INE;

    @JsonProperty("parentezco")
    String kinship;

    @JsonProperty("tipo_Contacto")
    String typeContact;

    @JsonProperty("grupo_Sanguineo")
    String blood;

    @JsonProperty("personal_data")
    PersonalData personalData;

}
