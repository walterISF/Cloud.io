package io.cloud.api.services;

import io.cloud.api.documents.ClientePessoaFisica;
import io.cloud.api.documents.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private ClienteService clienteService;

    public ClientePessoaFisica validarLogin(Login login){
        ClientePessoaFisica cliente = this.clienteService.obterClientePorLogin(login.getEmail());
        if(cliente.getLoginCliente().getSenha().equals(login.getSenha())){
            return cliente;
        }
        return null;
    }
}
