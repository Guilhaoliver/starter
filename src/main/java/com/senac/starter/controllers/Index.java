package com.senac.starter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Index {

    @GetMapping("/")
    public ModelAndView home(){
        System.out.println("Entrou no home");
        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;

    }
    @GetMapping("/filmes")
    public String filmes(){
        System.out.println("Entrou no Filmes");

        return "filmes";
    }
    @GetMapping("/jogos")
    public String java(){
        System.out.println("Entrou no Jogos");

        return "jogos";
    }
    @GetMapping("/posts")
    public String posts(){
        System.out.println("Entrou no Posts");

        return "posts";
    }
    @GetMapping("/contato")
    public String contato(){
        System.out.println("Entrou no contato");

        return "contato";
    }
}
