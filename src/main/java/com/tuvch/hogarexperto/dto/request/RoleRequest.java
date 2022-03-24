package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RoleRequest {
    @JsonProperty("id_Rol")
    int roleId;

    @JsonProperty("rol")
    String role;

    @JsonProperty("permisos")
    String permission;

}
