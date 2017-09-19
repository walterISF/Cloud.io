package io.cloud.api.services;

import io.cloud.api.entities.Client;
import io.cloud.api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(){
        return this.clientRepository.findOne(1);
    }
}
