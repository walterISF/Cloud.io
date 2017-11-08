package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="cartoesDeCredito")
public class CartaoDeCredito {

    @Id
    private String idCartaoDeCredito;

    private String numeroDoCartao;

    private String numeroDeSeguranca;


}
