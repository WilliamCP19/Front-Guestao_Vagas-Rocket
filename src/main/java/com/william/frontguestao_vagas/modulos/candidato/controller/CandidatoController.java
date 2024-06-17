package com.william.frontguestao_vagas.modulos.candidato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidate")
public class CandidatoController {

    @GetMapping("/")
    public String login () {
        return "candidato/login";
    }
}
