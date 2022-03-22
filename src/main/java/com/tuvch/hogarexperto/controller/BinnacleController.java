package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.BinnacleRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bitacoras")

public class BinnacleController {
    @GetMapping()
    public String findBinnacle(@RequestParam("binnacleId") int binnacledId){
        return "Busque la bitacora " + binnacledId;
    }

    @PostMapping()
    public String createBinnalce(@RequestBody BinnacleRequest bitacoraBody){
        return "Insertaré la clave unica del expediente" + bitacoraBody.toString();
    }

    @DeleteMapping("/{relativeId}")
    public String delete(@PathVariable int relativeId){
        return "borrar el familiar"+ relativeId;
    }

}
