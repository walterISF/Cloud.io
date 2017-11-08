package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="enderecos")
public class Endereco {

    @Id
    private String idEndereco;

    private String logradouro;

    private String numeroEndereco;

    private String complementoEndereco;

    private String cep;

    private String cidade;

    private String estado;

    private String pais;

}
