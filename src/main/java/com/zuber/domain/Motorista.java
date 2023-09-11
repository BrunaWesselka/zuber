package com.zuber.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motorista {
    private String nomeMotorista;
    private String veiculo;
    private int cnh;

    public Motorista(String nomeMotorista, String veiculo, int cnh) {
        this.nomeMotorista = nomeMotorista;
        this.veiculo = veiculo;
        this.cnh = cnh;
    }
}