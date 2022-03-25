package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.BinnacleRequest;
import com.tuvch.hogarexperto.dto.response.BinnacleResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bitacoras")

public class BinnacleController {
    @GetMapping()
    public BinnacleResponse findBinnacle(@RequestParam("binnacleId") int binnacleId){
        return BinnacleResponse.buildMock();
    }

    @PostMapping()
    public StatusResponse createBinnacle(@RequestBody BinnacleRequest bitacoraBody){
        return StatusResponse.buildMock();
    }

    @DeleteMapping()
    public StatusResponse deleteBinnacle(@PathVariable int relativeId){
        return StatusResponse.buildMock();
    }

}
