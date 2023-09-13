package com.zuber.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository rep;

    public Iterable<Motorista> getMotoristas() {
        return rep.findAll();
    }

    public Optional<Motorista> getMotoristasById(Long id) {
        return rep.findById(id);
    }

    public Motorista save (Motorista motorista){
        return rep.save(motorista);
    }

    public List<Motorista> getMotoristasFake() {
        List<Motorista> motoristas = new ArrayList<>();

        motoristas.add(new Motorista("Jabel", "Onix", "45451"));
        motoristas.add(new Motorista("Caique", "Sandero", "569465"));
        motoristas.add(new Motorista("Robson", "Corolla", "55645631"));

        return motoristas;
    }

}
