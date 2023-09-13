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

    private String nomeMotorista; //TODO: não precisa ser 'nomeMotorista' porque a chamada do objeto vai ser 'motorista.nomeMotorista', pode ser só nome pois esta dentro de um objeto Motorista
    private String veiculo;
    private String cnh;

    public Motorista(){ //TODO: Esse construtor pode ser removido
    }

    public Motorista(String nomeMotorista, String veiculo, String cnh) { //TODO: usar o lombok para gerar esse código com @AllArgsConstructor
        this.nomeMotorista = nomeMotorista;
        this.veiculo = veiculo;
        this.cnh = cnh;
        this.id = id;
    }
}