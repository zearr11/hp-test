package pe.edu.idat.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping()
    public String goHome() {
        return "home";
    }
    
}
