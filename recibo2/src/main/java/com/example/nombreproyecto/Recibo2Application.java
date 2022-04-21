package com.example.nombreproyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Recibo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Recibo2Application.class, args);
	}
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Alambre de cobre";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String vendor = "Tienda de la esquina Pequeñas Cosas";
    
    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
        
        model.addAttribute("nombre", name);
        model.addAttribute("item", itemName);
		model.addAttribute("precio", price);
		model.addAttribute("descripcion", description);
		model.addAttribute("vendedor",vendor);
        
    
        return "index.jsp";
    }

}
