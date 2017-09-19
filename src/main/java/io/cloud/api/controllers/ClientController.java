package io.cloud.api.controllers;

import io.cloud.api.entities.Client;
import io.cloud.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/client")
@CrossOrigin(allowedHeaders = "*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value="", method=RequestMethod.GET)
    public Client saveClient(){
        return this.clientService.saveClient();
    }

}
