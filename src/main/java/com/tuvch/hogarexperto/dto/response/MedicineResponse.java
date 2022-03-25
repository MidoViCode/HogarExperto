package com.tuvch.hogarexperto.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class MedicineResponse {
    @JsonProperty("nombre")
    String description;

    @JsonProperty("viaAdministración")
    String routeAdministration;

    @JsonProperty("fechaCaducidad")
    String expiryDate;

    @JsonProperty("dosisFarmaceutica")
    String pharmaceuticalDose;

    @JsonProperty("indicacionesUso")
    String indicationsUse;

    public static MedicineResponse buildMock(){
        return MedicineResponse.builder()
                .description("Paracetamol")
                .pharmaceuticalDose("600mg")
                .routeAdministration("Oral - tabletas")
                .expiryDate("24/10/1222")
                .indicationsUse("Tomar una tableta cada 8 horas")
                .build();
    }
}
