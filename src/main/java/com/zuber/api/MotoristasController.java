package com.zuber.api;

import com.zuber.domain.Motorista;
import com.zuber.domain.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/motoristas")
public class MotoristasController {
    @Autowired
    private MotoristaService service;

    @GetMapping()
    public Iterable<Motorista> get() {  //TODO: O nome deve fazer sentido, poderia ser "buscarTodosOsMotoristas"
        return service.getMotoristas();
    }

    @GetMapping("/{id}")
    public Optional<Motorista> get(@PathVariable("id") Long id){ //TODO: devemos retornar um motorista e não um 'Optional' para isso, na service use findById(id).orElse(null);
        return service.getMotoristasById(id);
    }

    @PostMapping
    public String post (@RequestBody Motorista cadastrarMotorista){
        Motorista m = service.save(cadastrarMotorista);
        return "Motorista salvo com sucesso: " + m.getId();
    }

    @PutMapping("/{id}")
    public String put(@PathVariable("id") Long id, @RequestBody Motorista motorista){

        Motorista m = service.update(motorista, id);
        return "Carro atualizado com sucesso" + m.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.delete(id);

        return "Motorista deletado com sucesso";
    }
}
