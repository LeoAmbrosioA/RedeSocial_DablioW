package br.com.DablioW.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsuarioController
 */
@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public String texto(){
        return "accit";
    }
}