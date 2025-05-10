package com.exemplo.consultacpf.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cpf")
public class ConsultaCpfController {

    @GetMapping("/{cpf}")
    public String consultarNomePorCpf(@PathVariable String cpf) {
        switch (cpf) {
            case "11111111111":
                return "João da Silva";
            case "22222222222":
                return "Maria Oliveira";
            case "33333333333":
                return "Carlos Souza";
            case "44444444444":
                return "Ana Pereira";
            case "55555555555":
                return "Pedro Santos";
            default:
                return "CPF não encontrado";
        }
    }
    
    @PostMapping
    public String consultarNomePorCpfPost(@RequestBody CpfRequest request) {
    String cpf = request.getCpf();
      switch (cpf) {
        case "11111111111":
            return "João da Silva";
        case "22222222222":
            return "Maria Oliveira";
        case "33333333333":
            return "Carlos Souza";
        case "44444444444":
            return "Ana Pereira";
        default:
            return "CPF não encontrado";
    }
  }
}

