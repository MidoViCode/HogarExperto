package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.AdminRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")

public class AdminController {
    @GetMapping()
    public String findAdmin(@RequestParam("adminId") int adminId){
        return "Busque el admin" + adminId;
    }

    @PostMapping()
    public String createAdmin(@RequestBody AdminRequest adminBody){
        return "Insertaré al admin" + adminBody.toString();
    }

    @DeleteMapping("/{adminId}")
    public String deleteAdmin(@PathVariable int adminId){
        return "Borrar al admin" + adminId;
    }

}
