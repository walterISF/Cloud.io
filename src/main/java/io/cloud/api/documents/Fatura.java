package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.List;

@Data
@Document(collection="faturas")
public class Fatura {

    public enum Status {PAGA, NAOPAGA}

    @Id
    private String faturaId;

    private ClientePessoaFisica cliente;

    private List<Plano> planosContratados;

    private Double valorTotalFatura;

    private Calendar dataReferenciaFatura;

    private Status status;

}
