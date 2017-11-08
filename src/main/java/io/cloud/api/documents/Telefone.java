package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="telefones")
public class Telefone {

    @Id
    private String idTelefone;

    private String nomeTelefone;

    private Integer codigoDeArea;

    private String ddd;

    private String numeroTelefone;
}
