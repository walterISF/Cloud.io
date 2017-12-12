package io.cloud.api.controllers;

import io.cloud.api.documents.ClientePessoaFisica;
import io.cloud.api.documents.Login;
import io.cloud.api.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ClientePessoaFisica validarLogin(@RequestBody Login login){
        return this.loginService.validarLogin(login);
    }

}
