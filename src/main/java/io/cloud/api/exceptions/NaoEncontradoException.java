package io.cloud.api.exceptions;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(String mensagem){
        super(mensagem);
    }
}