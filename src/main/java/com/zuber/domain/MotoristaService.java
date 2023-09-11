package com.zuber.domain;
import java.util.ArrayList;
import java.util.List;

public class MotoristaService {
    public List<Motorista> getMotoristas() {
        List<Motorista> motoristas = new ArrayList<>();

        motoristas.add(new Motorista("Jabel", "Onix", 45451));
        motoristas.add(new Motorista("Caique", "Sandero", 569465));
        motoristas.add(new Motorista("Robson", "Corolla", 55645631));

        return motoristas;
    }
}
