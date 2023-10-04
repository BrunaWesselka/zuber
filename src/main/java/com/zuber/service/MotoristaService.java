package com.zuber.service;
import com.zuber.domain.Motorista;
import com.zuber.exception.MotoristaNaoEncontrado;
import com.zuber.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository buscarMotorista;
    public Iterable<Motorista> getMotoristas() {
        return buscarMotorista.findAll();
    }

    public Optional<Motorista> getMotoristasById(Long id) { //TODO: O idioma deve ser um se é em ingles seria Driver
        return buscarMotorista.findById(id);
    }

    public Motorista save (Motorista motorista){
        return buscarMotorista.save(motorista);
    }

    public Motorista update(Motorista motorista, Long id){
        Assert.notNull(id, "Não foi possível atualizar o motorista");

        Optional<Motorista> optional = getMotoristasById(id);
        if(optional.isPresent()) {
            Motorista db = optional.get();

            db.setNome(motorista.getNome());

            db.setCnh(motorista.getCnh());

            buscarMotorista.save(db);
            return db;
        } else {
            throw new MotoristaNaoEncontrado("Não foi possível atualizar o motorista " + id);
        }
    }

    public void delete(Long id){
        Optional<Motorista> motorista = getMotoristasById(id);
        if(motorista.isPresent()){
            buscarMotorista.deleteById(id);
        }
    }
}

