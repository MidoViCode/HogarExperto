package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class BinnacleTypeRequest {
    @JsonProperty("id_tipoBitacora")
    int binnaTypeId;

    @JsonProperty("descripcion")
    String description;
}
