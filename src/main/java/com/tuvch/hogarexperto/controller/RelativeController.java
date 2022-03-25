package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.RelativeRequest;
import com.tuvch.hogarexperto.dto.response.RelativeResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/familiares")

public class RelativeController {
    @GetMapping("")
    public RelativeResponse findRelatives(@RequestParam("relativeId") int relativeId){
        return RelativeResponse.buildMock();
    }

    @PostMapping()
    public StatusResponse createRelatives(@RequestBody RelativeRequest relativeBody){
        return StatusResponse.buildMock();
    }

    @DeleteMapping()
    public StatusResponse deleteRelatives(@PathVariable int relativeId){

        return StatusResponse.buildMock();
    }

}
