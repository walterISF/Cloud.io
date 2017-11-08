package io.cloud.api.services;

import io.cloud.api.documents.Servidor;
import io.cloud.api.repositories.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService {

    @Autowired
    private ServidorRepository servidorRepository;

    public List<Servidor> obterTodosServidores() {
        return this.servidorRepository.findAll();
    }

    public Servidor salvarServidor(Servidor servidor){
        return this.servidorRepository.save(servidor);
    }
}
