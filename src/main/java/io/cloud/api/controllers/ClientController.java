package io.cloud.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/client")
@CrossOrigin(allowedHeaders = "*")
public class ClientController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String saveClient(){
        return "FOI";
    }

}
