package io.cloud.api.controllers;

import io.cloud.api.documents.Fatura;
import io.cloud.api.services.FaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/fatura")
public class FaturaController {

    @Autowired
    private FaturaService faturaService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Fatura> obterTodasFaturas(){
        return this.faturaService.obterTodasFaturas();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Fatura> obterFaturasPorCliente(@PathVariable(value="id") String id){
        return this.faturaService.obterFaturasPorCliente(id);
    }

    @RequestMapping(value="/np/{id}", method= RequestMethod.GET)
    public List<Fatura> obterFaturasNaoPagasPorCliente(@PathVariable(value="id") String id){
        return this.faturaService.obterFaturasNaoPagasPorCliente(id);
    }

    @RequestMapping(value = "/np", method = RequestMethod.GET)
    public List<Fatura> obterTodasFaturasNaoPagas(){
        return this.faturaService.obterTodasFaturasNaoPagas();
    }

    @RequestMapping(value="/p/{id}", method = RequestMethod.GET)
    public List<Fatura> obterFaturasPagasPorCliente(@PathVariable(value="id") String id){
        return this.faturaService.obterFaturasPagasPorCliente(id);
    }

    @RequestMapping(value = "/p", method = RequestMethod.GET)
    public List<Fatura> obterTodasFaturasPagas(){
        return this.faturaService.obterTodasFaturasPagas();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Fatura abrirNovaFatura(@RequestBody Fatura fatura){
        return this.faturaService.salvarFatura(fatura);
    }
}
