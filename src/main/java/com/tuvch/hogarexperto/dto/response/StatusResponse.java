package com.tuvch.hogarexperto.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StatusResponse {
    Status status;
    //MOCK
    public static StatusResponse buildMock(){
        return StatusResponse.builder()
                .status(Status.OK)
                .build();
    }
}
