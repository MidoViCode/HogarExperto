package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.MedicalRecordRequest;
import com.tuvch.hogarexperto.dto.response.MedicalRecordResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expedientes")

public class MedicalRecordController {
    @GetMapping()
    public MedicalRecordResponse findMedicalRecord(@RequestParam("medicalRecordId") int medicalRecordId){
        return MedicalRecordResponse.buildMock();
    }

    @PostMapping()
    public StatusResponse createMedicalRecord(@RequestBody MedicalRecordRequest expedientesBody){
        return StatusResponse.buildMock();
    }

    @DeleteMapping()
    public StatusResponse deleteMedicalRecord(@PathVariable int medicalRecordId){

        return StatusResponse.buildMock();
    }

}
