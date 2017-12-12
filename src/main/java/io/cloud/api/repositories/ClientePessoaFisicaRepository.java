package io.cloud.api.repositories;

import io.cloud.api.documents.ClientePessoaFisica;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientePessoaFisicaRepository extends MongoRepository<ClientePessoaFisica, String> {

    List<ClientePessoaFisica> findAllByStatus(ClientePessoaFisica.Status status);

    ClientePessoaFisica findByLogin_Email(String email);
}
