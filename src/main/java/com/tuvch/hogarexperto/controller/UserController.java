package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")  //Esto cambia
public class UserController {

    @GetMapping("")
    public String findUsers(@RequestParam("user_type") int userType){
        return "Busqué el userType: "+userType;

    }
    @PostMapping("")
    public String createUser(@RequestBody UserRequest userBody){
        return "Inseretaré el userType: "+userBody.toString();

    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId){
        return "Borrar el userType: "+userId;

    }

}
