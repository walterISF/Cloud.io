package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Calendar;
import java.util.List;

@Data
@Document(collection="clientes")
public class ClientePessoaFisica {

    public enum Status {ATIVO, INATIVO}

    @Id
    private String idCliente;

    private String nomeCliente;

    private String cpf;

    private Character sexo;

    private Calendar dataNascimento;

    private List<Endereco> enderecoList;

    private List<Telefone> telefoneList;

    private Status status;

    private List<CartaoDeCredito> cartaoDeCreditoList;

    private Login loginCliente;

    public ClientePessoaFisica(){}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
