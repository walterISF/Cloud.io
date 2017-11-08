package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="planos")
public class Plano {

    @Id
    private String planoId;

    private Double valorPlano;

    private Double valorPlanoHora;

    private String memoriaRAM;

    private String processamento;

    private String armazenamento;

    private String taxaTransferencia;

}
