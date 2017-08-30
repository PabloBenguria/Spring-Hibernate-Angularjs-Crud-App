package com.ejercicio.neptuno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularRoutesCtrl {

	@RequestMapping({
        "/clientes",
        "/clientes/{id:\\w+}",
        "/empleados",
        "/empleados/{id:\\w+}",
        "/pedidos",
        "/pedidos/{id:\\w+}"
    })
    public String index() {
        return "forward:/index.html";
    }
	
	
}
