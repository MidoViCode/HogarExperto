package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequest {

    String username;
    String password;

    @JsonProperty("user_type")
    int userType;

    @JsonProperty("personal_data")
    PersonalData personalData;

}
