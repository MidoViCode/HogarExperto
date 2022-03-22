package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.PatientRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expertos")
public class PatientController {
    @GetMapping()
    public String findPatient(@RequestParam("patiendtId") int patientId){
        return "BUsque el experto" + patientId;
    }


    @PostMapping()
    public String createPatient(@RequestBody PatientRequest expertoBody){
        return "Insertaré al experto" + expertoBody.toString();
    }

    @DeleteMapping()
    public String deletePatient(@PathVariable int expertoId){
        return "borrar el experto" + expertoId;
    }


}
