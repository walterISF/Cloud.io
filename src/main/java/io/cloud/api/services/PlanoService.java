package io.cloud.api.services;

import io.cloud.api.documents.Plano;
import io.cloud.api.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    public List<Plano> obterTodosPlanos() {
        return this.planoRepository.findAll();
    }

    public Plano salvarPlano(Plano plano) {
        return this.planoRepository.save(plano);
    }
}
