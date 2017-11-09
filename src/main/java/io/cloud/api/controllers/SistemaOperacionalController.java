package io.cloud.api.controllers;

import io.cloud.api.documents.SistemaOperacional;
import io.cloud.api.services.SistemaOperacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/sistemaOperacional")
@CrossOrigin(allowedHeaders = "*")
public class SistemaOperacionalController {

    @Autowired
    private SistemaOperacionalService sistemaOperacionalService;

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<SistemaOperacional> obterTodosSistemasOperacionais(){
        return this.sistemaOperacionalService.obterTodosSistemasOperacionais();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public SistemaOperacional salvarSistemaOperacional(@RequestBody SistemaOperacional sistemaOperacional){
        return this.sistemaOperacionalService.salvarSistemaOperacional(sistemaOperacional);
    }

}
