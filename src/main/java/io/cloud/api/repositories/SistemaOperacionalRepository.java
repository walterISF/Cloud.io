package io.cloud.api.repositories;

import io.cloud.api.documents.SistemaOperacional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SistemaOperacionalRepository extends MongoRepository<SistemaOperacional, String> {

}
