package io.cloud.api.controllers;

import io.cloud.api.documents.Plano;
import io.cloud.api.services.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/plano")
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<Plano> obterTodosPlanos(){
        return this.planoService.obterTodosPlanos();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public Plano salvarPlano(@RequestBody Plano plano){
        return this.planoService.salvarPlano(plano);
    }
}
