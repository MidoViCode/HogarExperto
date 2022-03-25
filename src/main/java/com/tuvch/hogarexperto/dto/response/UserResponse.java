package com.tuvch.hogarexperto.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tuvch.hogarexperto.dto.request.PersonalData;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class UserResponse {

    @JsonProperty("personal_data")
    PersonalData personalData;

    @JsonProperty("cedula")
    String professionalLicense;

    @JsonProperty("turno")
    String shift;

    public static UserResponse buildMock(){
        return UserResponse.builder()
                .professionalLicense("201455")
                .shift("matutino")
                .personalData(PersonalData.buildMock())
                .build();
    }
}