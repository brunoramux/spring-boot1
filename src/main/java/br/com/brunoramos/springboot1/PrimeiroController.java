package br.com.brunoramos.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/primeira")
public class PrimeiroController {
    @GetMapping("/primeiroMetodo")
    public String getMethodName() {
        return "Meu primeiro metodo";
    }
    
}

