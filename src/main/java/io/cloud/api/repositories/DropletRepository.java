package io.cloud.api.repositories;

import io.cloud.api.documents.Droplet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DropletRepository extends MongoRepository<Droplet, String> {

    List<Droplet> findByClientePessoaFisica_Cpf(String id);
}
