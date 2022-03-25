package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.MedicineRequest;
import com.tuvch.hogarexperto.dto.response.MedicineResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicinas")
public class MedicineController {
    @GetMapping()
    public MedicineResponse findMedicine(@RequestParam("medicineId") int medicineId) {
        return MedicineResponse.buildMock();
    }

    @PostMapping()
    public StatusResponse createMedicine(@RequestBody MedicineRequest medicineBody){
        return StatusResponse.buildMock();
    }
    @DeleteMapping()
    public StatusResponse deleteMedicine(@PathVariable int medicineId){
        return StatusResponse.buildMock();
    }
}
