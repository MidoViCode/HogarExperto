package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
