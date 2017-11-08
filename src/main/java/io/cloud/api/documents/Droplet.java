package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="droplets")
public class Droplet {

    @Id
    private String dropletId;

    private String nomeDroplet;

    private SistemaOperacional sistemaOperacional;

    private Servidor servidor;

    private Plano plano;

    private ClientePessoaFisica clientePessoaFisica;

}
