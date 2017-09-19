package io.cloud.api.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue
    private Integer idClient;

    private String name;
}
