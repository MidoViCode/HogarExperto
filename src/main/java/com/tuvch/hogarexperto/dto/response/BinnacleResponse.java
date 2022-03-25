package com.tuvch.hogarexperto.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tuvch.hogarexperto.dto.request.PatientRequest;
import com.tuvch.hogarexperto.dto.request.PersonalData;
import com.tuvch.hogarexperto.dto.request.UserRequest;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class BinnacleResponse {
    @JsonProperty("fecha")
    Date date;
    @JsonProperty("valor")
    String value;

    @JsonProperty("personal")
    PersonalData personalData;

    @JsonProperty("nombre") //enfermero
    UserRequest name;

   // @JsonProperty("nombre") //viejito
   // PatientRequest name;


    public static BinnacleResponse buildMock(){
        return BinnacleResponse.builder()
                .value("Se levanto al baño")
                //.date()

                .build();
    }
}
