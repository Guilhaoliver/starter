package com.senac.starter.controllers;

import com.senac.starter.models.Animal;
import com.senac.starter.repositorys.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/animais")
public class AnimalIndex {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("")
    public ModelAndView listar(){

        ModelAndView modelAndView = new ModelAndView("animais");

        List<Animal> animais = animalRepository.findAll();

        return modelAndView;
    }
}
