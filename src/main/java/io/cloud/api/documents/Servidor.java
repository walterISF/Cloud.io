package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="servidores")
public class Servidor {

    @Id
    private String servidorId;

    private String nomeServidor;

    private String caminhoIcone;

}
