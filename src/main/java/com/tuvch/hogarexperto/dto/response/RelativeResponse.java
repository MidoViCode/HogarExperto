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

public class RelativeResponse {
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

    public static RelativeResponse buildMock(){
        return RelativeResponse.builder()
                .INE("VIMEJN26454")
                .kinship("Hijo")
                .typeContact("Emergencias 1")
                .blood("O-")
                .personalData(PersonalData.buildMock())
                .build();
    }
}
