package io.cloud.api.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="logins")
public class Login {

    @Id
    private String idLogin;

    private String email;

    private String senha;

}
