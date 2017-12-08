package io.cloud.api.controllers;

import io.cloud.api.documents.ClientePessoaFisica;
import io.cloud.api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(value="/pf", method=RequestMethod.GET)
    public List<ClientePessoaFisica> obterTodosClientesPF(){
        return clienteService.obterTodosClientesPF();
    }

    @RequestMapping(value="/pf/{id}", method=RequestMethod.GET)
    public ClientePessoaFisica obterClientePFPorId(@PathVariable(value="id") String id){
        return clienteService.obterClientePFPorId(id);
    }

    @RequestMapping(value="/pf", method=RequestMethod.POST)
    public ClientePessoaFisica salvarClientePF(@RequestBody ClientePessoaFisica clientePessoaFisica){
        return clienteService.salvarClientePF(clientePessoaFisica);
    }

    @RequestMapping(value="/pf", method=RequestMethod.PUT)
    public ClientePessoaFisica alterarClientePF(@RequestBody ClientePessoaFisica clientePessoaFisica){
        return clienteService.alterarClientePF(clientePessoaFisica);
    }

    @RequestMapping(value="/pf/{id}", method=RequestMethod.DELETE)
    public void excluirClientePF(@PathVariable(value="id") String id){
        clienteService.excluirClientePF(id);
    }

    //TODO: colocar um status com enum, quando salvar seta ativo e quando deletar seta inativo.

}
