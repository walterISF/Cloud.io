package io.cloud.api.services;

import io.cloud.api.entities.Client;
import io.cloud.api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAllClients(){

        return clientRepository.findAll();

    }

}
