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
    private MotoristaRepository rep; //TODO: Evitar nomes curtos assim, o nome deve ser claro, porque poderia ter 4 repositorios

    //TODO: Ao longo do fluxo os nomes podem fazer  sentido
    // Exemplo, se na controle chama "buscarMotoristas" na service pode ter o mesmo nome
    public Iterable<Motorista> getMotoristas() {
        return rep.findAll();
    }

    public Optional<Motorista> getMotoristasById(Long id) { //TODO: O idioma deve ser um se é em ingles seria Driver
        return rep.findById(id);
    }

    public Motorista save (Motorista motorista){
        return rep.save(motorista);
    }

    public List<Motorista> getMotoristasFake() { //TODO: Apagar o código antigo
        List<Motorista> motoristas = new ArrayList<>();

        motoristas.add(new Motorista("Jabel", "Onix", "45451"));
        motoristas.add(new Motorista("Caique", "Sandero", "569465"));
        motoristas.add(new Motorista("Robson", "Corolla", "55645631"));

        return motoristas;
    }

}
