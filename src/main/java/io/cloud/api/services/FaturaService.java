package io.cloud.api.services;

import io.cloud.api.documents.Fatura;
import io.cloud.api.repositories.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    @Autowired
    private FaturaRepository faturaRepository;


    public List<Fatura> obterFaturasNaoPagasPorCliente(String id) {
        return this.faturaRepository.findByClienteAndStatus(id, Fatura.Status.NAOPAGA);
    }

    public List<Fatura> obterFaturasPagasPorCliente(String id) {
        return this.faturaRepository.findByClienteAndStatus(id, Fatura.Status.PAGA);
    }

    public Fatura salvarFatura(Fatura fatura) {
        fatura.setStatus(Fatura.Status.NAOPAGA);
        return this.faturaRepository.save(fatura);
    }
}

