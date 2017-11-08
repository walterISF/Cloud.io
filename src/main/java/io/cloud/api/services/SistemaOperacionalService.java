package io.cloud.api.services;

import io.cloud.api.documents.SistemaOperacional;
import io.cloud.api.repositories.SistemaOperacionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaOperacionalService {

    @Autowired
    private SistemaOperacionalRepository sistemaOperacionalRepository;

    public List<SistemaOperacional> obterTodosSistemasOperacionais(){
        return this.sistemaOperacionalRepository.findAll();
    }

    public SistemaOperacional salvarSistemaOperacional(SistemaOperacional sistemaOperacional) {
        return this.sistemaOperacionalRepository.save(sistemaOperacional);
    }
}
