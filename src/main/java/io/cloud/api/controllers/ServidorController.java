package io.cloud.api.controllers;

import io.cloud.api.documents.Servidor;
import io.cloud.api.services.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/servidor")
public class ServidorController {

    @Autowired
    private ServidorService servidorService;

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<Servidor> obterTodosServidores(){
        return this.servidorService.obterTodosServidores();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public Servidor salvarServidor(@RequestBody Servidor servidor){
        return this.servidorService.salvarServidor(servidor);
    }
}
