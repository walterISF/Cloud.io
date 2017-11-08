package io.cloud.api.repositories;

import io.cloud.api.documents.Servidor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends MongoRepository<Servidor, String> {

}
