package br.com.brunoramos.springboot1;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/segundo")
public class SegundoController {
    @GetMapping("/primeiroMetodo/{id}")
    public String getMethodName(@PathVariable String id) {
        return "Meu rota com parametro" + id;
    }

    @GetMapping("/metodoQueryParams")
    public String getMethodName2(@RequestParam String id) {
        return "Meu rota com parametro" + id;
    }

    @GetMapping("/metodoQueryParam2")
    public String getMethodName3(@RequestParam Map<String, String> allParams) {
        return "Meu rota com parametro" + allParams;
    }

    @PostMapping("/metodoBody")
    public String getMethodName4(@RequestBody String username) {
        return "Meu rota com parametro" + username;
    }

    @PostMapping("/metodoHeader")
    public String getMethodName5(@RequestHeader("name") String name) {
        return "Meu rota com parametro" + name;
    }
    
}
    

