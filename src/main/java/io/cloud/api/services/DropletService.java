package io.cloud.api.services;

import io.cloud.api.documents.Droplet;
import io.cloud.api.repositories.DropletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DropletService {

    @Autowired
    private DropletRepository dropletRepository;

    public List<Droplet> obterTodosDropletsPorCliente(String id) {
        return this.dropletRepository.findByClientePessoaFisica_Cpf(id);
    }

    public Droplet salvarDroplet(Droplet droplet){
        return this.dropletRepository.save(droplet);
    }
}
