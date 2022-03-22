package com.tuvch.hogarexperto.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expedientes")

public class MedicalRecordController {
    @GetMapping()
    public String findMedicalRecord(@RequestParam("medicalRecordId") int medicalRecordId){
        return "Busque el expdiente" + medicalRecordId;
    }

 //   @PostMapping()
 //   public String createMedicalRecord(@RequestBody medicalRecordRequest expedienteBody){
 //       return "Insertaré expediente" + expedienteBody.toString();
 //   }

    @DeleteMapping("/{medicalRecordId}")
    public String delete(@PathVariable int medicalRecordId){

        return "borrar el expediente " + medicalRecordId;
    }

}
