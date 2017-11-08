package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String idProduto;



}
