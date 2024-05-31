package com.william.frontguestao_vagas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrimeiraPaginaController {

    @GetMapping("/home")
    public String primeiraPaginaHTML(Model model) {
        model.addAttribute("mensagemController", "Primeira Mensagem vindo da Controller");
        return "PrimeiraPagina";
    }

    @GetMapping("/login")
    public String logarCandidato () {
        return "candidato/login";
    }
}
