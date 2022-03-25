package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.PatientRequest;
import com.tuvch.hogarexperto.dto.response.PatientResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import com.tuvch.hogarexperto.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expertos")

public class PatientController {
    @Autowired
    private PatientService patientService;


    @GetMapping()
    public PatientResponse findPatient(@RequestParam("patientId") int patientId){
        return patientService.findPatient(patientId);
    }

    @PostMapping()
    public StatusResponse createPatient(@RequestBody PatientRequest expertoBody){
        return patientService.createPatient(expertoBody);
    }

    @DeleteMapping()
    public StatusResponse deletePatient(@PathVariable int expertoId){

        return StatusResponse.buildMock();
    }

}
