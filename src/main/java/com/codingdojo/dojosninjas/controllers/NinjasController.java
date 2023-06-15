package com.codingdojo.dojosninjas.controllers;

import com.codingdojo.dojosninjas.models.Dojos;
import com.codingdojo.dojosninjas.models.Ninjas;
import com.codingdojo.dojosninjas.services.DojosService;
import com.codingdojo.dojosninjas.services.NinjasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class NinjasController {
    @Autowired
    NinjasService ninjasService;

    @Autowired
    DojosService dojosService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("allDojos", dojosService.allDojos());
        return "home";
    }

    @GetMapping("/ninjas")
    public String newNinjas(@ModelAttribute("ninjas") Ninjas ninjas, Model model) {
        model.addAttribute("allDojos" , dojosService.allDojos());
        return "newNinja";
    }

    @PostMapping("/ninjas")
    public String createNinjas(@Valid @ModelAttribute("ninjas") Ninjas ninjas, BindingResult result) {
        if (result.hasErrors()) {
            return "newNinja";
        }
        ninjasService.createNinja(ninjas);
        return "redirect:/";
    }


    @GetMapping("/dojos")
    public String newDojos(@ModelAttribute("dojos") Dojos dojos) {
        return "newDojo";
    }

    @PostMapping("/dojos")
    public String createDojos(@Valid @ModelAttribute("dojos") Dojos dojos, BindingResult result) {
        if (result.hasErrors()) {
            return "newDojo";
        }
        dojosService.createDojos(dojos);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String detailsDojo(@PathVariable Long id , Model model){
        model.addAttribute("dojos" , dojosService.findDojo(id) );
        return "details";
    }



}
