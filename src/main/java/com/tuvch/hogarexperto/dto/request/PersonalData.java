package com.tuvch.hogarexperto.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PersonalData {
    @JsonProperty("nombre")
    String name;

    @JsonProperty("ap_Paterno")
    String lastname;

    @JsonProperty("ap_Materno")
    String motherLastName;

    @JsonProperty("fecha_Nacimiento")
    String birthday;

    @JsonProperty("genero")
    String genre;

    @JsonProperty("telefono")
    String phone;

    @JsonProperty("direccion")
    String adress;

    @JsonProperty("correo")
    String email;


    public static PersonalData buildMock(){
        return PersonalData.builder()
                .name("Arturo ")
                .lastname("Jimenez")
                .motherLastName("Vigueras")
                .birthday("25-09-1992")
                .adress("Huixqui")
                .genre("Masculino")
                .phone("555555555")
                .email("artur@gmail.com")
                .build();
    }
}
