package com.tuvch.hogarexperto.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BinnacleRequest {

    String userId;

    @JsonProperty("fecha")
    Date date;
    @JsonProperty("valor")
    String value;

}
