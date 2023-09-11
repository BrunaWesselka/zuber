package com.zuber.domain;

public class Motorista {
    private String nomeMotorista;
    private String veiculo;
    private int cnh;

    public Motorista(String nomeMotorista, String veiculo, int cnh) {
        this.nomeMotorista = nomeMotorista;
        this.veiculo = veiculo;
        this.cnh = cnh;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public int getCnh() {
        return cnh;
    }
}
