package com.zuber.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Motorista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMotorista;
    private String veiculo;
    private String cnh;

    public Motorista(){
    }

    public Motorista(String nomeMotorista, String veiculo, String cnh) {
        this.nomeMotorista = nomeMotorista;
        this.veiculo = veiculo;
        this.cnh = cnh;
        this.id = id;
    }
}