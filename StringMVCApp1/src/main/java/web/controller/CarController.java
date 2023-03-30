package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;


import web.service.CarServiceWeb;

import javax.servlet.http.HttpServletRequest;



@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCar(Model model, HttpServletRequest request) {
        model.addAttribute("Car", new CarServiceWeb().getCarLimited(request));
        return "Cars";
    }
}
