package io.cloud.api.controllers;

import io.cloud.api.documents.Droplet;
import io.cloud.api.services.DropletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/droplet")
public class DropletController {

    @Autowired
    private DropletService dropletService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Droplet> obterTodosDropletsPorCliente(@PathVariable(value="id") String id){
        return this.dropletService.obterTodosDropletsPorCliente(id);
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public Droplet salvarDroplet(@RequestBody Droplet droplet){
        return this.dropletService.salvarDroplet(droplet);
    }
}
