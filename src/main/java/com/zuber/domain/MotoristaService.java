package com.zuber.domain;
import java.util.ArrayList;
import java.util.List;

public class MotoristaService {
    public List<Motorista> get Motoristas(){
        List<Motorista> motoristas = new ArrayList<>();

        motoristas.add(new Motorista(1L, "Jabel"));
        motoristas.add(new Motorista(1L, "Caique"));
        motoristas.add(new Motorista(1L, "Robson"));

        return motoristas;
    }
}
