package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MedicineRequest {

    @JsonProperty("idMedicamentos")
    int medicineId;

    @JsonProperty("nombre")
    String description;

    @JsonProperty("viaAdministración")
    String routeAdministration;

    @JsonProperty("fechaCaducidad")
    Date expiryDate;

    @JsonProperty("dosisFarmaceutica")
    String pharmaceuticalDose;

    @JsonProperty("indicacionesUso")
    String indicationsUse;

}
