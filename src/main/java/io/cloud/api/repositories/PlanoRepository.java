package io.cloud.api.repositories;

import io.cloud.api.documents.Plano;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanoRepository extends MongoRepository<Plano, String> {
}
