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

public class PatientResponse {
    @JsonProperty("grupo_sanguineo")
    String blood;

    @JsonProperty("info")
    String info;

    @JsonProperty("personal_data")
    PersonalData personalData;

    public static PatientResponse buildMock(){
        return PatientResponse.builder()
                .blood("O+")
                .info("observaciones generales ")
                .personalData(PersonalData.buildMock())
                .build();
    }
}
