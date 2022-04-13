package edu.elp.siselp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class Saludo {

    @GetMapping ("/saludo")
    public String saludo(){
        return "Hola mongol gaaaaaa!!!!!!!!!";

    }

    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Que chucha miras o ctmr";
    }

}
