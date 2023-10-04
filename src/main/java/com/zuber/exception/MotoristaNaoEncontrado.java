package com.zuber.exception;

public class MotoristaNaoEncontrado extends RuntimeException {
    public MotoristaNaoEncontrado(String mensagem) {
        super(mensagem);
    }
}
