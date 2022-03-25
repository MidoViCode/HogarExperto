package com.tuvch.hogarexperto.controller;

import com.tuvch.hogarexperto.dto.request.PatientRequest;
import com.tuvch.hogarexperto.dto.request.UserRequest;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import com.tuvch.hogarexperto.dto.response.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @GetMapping("")
    public UserResponse findUsers(@RequestParam("user_type") int userType){
        return UserResponse.buildMock();

    }
    @PostMapping("")
    public StatusResponse createUser(@RequestBody UserRequest userBody){
        return StatusResponse.buildMock();

    }

    @DeleteMapping("/{userId}")
    public StatusResponse deleteUser(@PathVariable int userId){
        return StatusResponse.buildMock();

    }


}
