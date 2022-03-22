package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.RelativeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/familiares")

public class RelativeController {
    @GetMapping("")
    public String findRelatives(@RequestParam("relativeId") int relativeId){

        return "Familiar:" + relativeId;
    }

    @PostMapping()
    public String createRelatives(@RequestBody RelativeRequest relativeBody){
        return "Insertaré la opción crear" + relativeBody.toString();
    }

    @DeleteMapping()
    public String delete(@PathVariable int relativeId){

        return "Borrar el Familiar  " + relativeId;
    }

}
