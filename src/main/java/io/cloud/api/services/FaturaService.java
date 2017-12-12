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

    public List<Fatura> obterTodasFaturas() {
        return this.faturaRepository.findAll();
    }

    public List<Fatura> obterFaturasPorCliente(String idCliente){
        return this.faturaRepository.findByCliente_Cpf(idCliente);
    }

    public List<Fatura> obterFaturasNaoPagasPorCliente(String id) {
        return this.faturaRepository.findByCliente_CpfAndStatus(id, Fatura.Status.NAOPAGA);
    }

    public List<Fatura> obterFaturasPagasPorCliente(String id) {
        return this.faturaRepository.findByCliente_CpfAndStatus(id, Fatura.Status.PAGA);
    }

    public List<Fatura> obterTodasFaturasNaoPagas() {
        return this.faturaRepository.findByStatus(Fatura.Status.NAOPAGA);
    }

    public List<Fatura> obterTodasFaturasPagas() {
        return this.faturaRepository.findByStatus(Fatura.Status.PAGA);
    }

    public Fatura salvarFatura(Fatura fatura) {
        fatura.setStatus(Fatura.Status.NAOPAGA);
        return this.faturaRepository.save(fatura);
    }
}

