package io.cloud.api.repositories;

import io.cloud.api.documents.Fatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaturaRepository extends MongoRepository<Fatura, String> {
    List<Fatura> findByClienteAndStatus(String id, Fatura.Status status);
}
