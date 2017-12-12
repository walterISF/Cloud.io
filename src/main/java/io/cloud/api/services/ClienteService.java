package io.cloud.api.services;

import io.cloud.api.documents.ClientePessoaFisica;
import io.cloud.api.exceptions.NaoEncontradoException;
import io.cloud.api.repositories.ClientePessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    private final String NAOENCONTRADO = "O Cliente solicitado não foi encontrado.";

    @Autowired
    ClientePessoaFisicaRepository clientePessoaFisicaRepository;

    public List<ClientePessoaFisica> obterTodosClientesPF(){
        return clientePessoaFisicaRepository.findAllByStatus(ClientePessoaFisica.Status.ATIVO);
    }

    public ClientePessoaFisica obterClientePFPorId(String id){
        ClientePessoaFisica cliente = clientePessoaFisicaRepository.findOne(id);
        if(cliente == null){
            throw new NaoEncontradoException(NAOENCONTRADO);
        }
        if(cliente.getStatus().equals(ClientePessoaFisica.Status.INATIVO)){
            throw new NaoEncontradoException(NAOENCONTRADO);
        }
        return cliente;
    }

    public ClientePessoaFisica salvarClientePF(ClientePessoaFisica clientePessoaFisica){
        clientePessoaFisica.setStatus(ClientePessoaFisica.Status.ATIVO);
        return clientePessoaFisicaRepository.save(clientePessoaFisica);
    }

    public ClientePessoaFisica alterarClientePF(ClientePessoaFisica clientePessoaFisica) {
        return clientePessoaFisicaRepository.save(clientePessoaFisica);
    }

    public void excluirClientePF(String id) {
        ClientePessoaFisica cliente = clientePessoaFisicaRepository.findOne(id);
        if(cliente == null){
            throw new NaoEncontradoException(NAOENCONTRADO);
        }
        cliente.setStatus(ClientePessoaFisica.Status.INATIVO);
        clientePessoaFisicaRepository.save(cliente);
    }

    public ClientePessoaFisica obterClientePorLogin(String email) {
        return this.clientePessoaFisicaRepository.findByLogin_Email(email);
    }
}
