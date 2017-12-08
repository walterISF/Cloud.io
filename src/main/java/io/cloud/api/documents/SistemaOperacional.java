package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection="sistemasOperacionais")
public class SistemaOperacional {

    @Id
    private String sistemaOperacionalId;

    private String nomeSistemaOperacional;

    private List<String> versaoSistemaOperacional;

    private String caminhoIcone;

}
