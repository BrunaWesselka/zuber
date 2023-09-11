package com.zuber.api;

import com.zuber.domain.Motorista;
import com.zuber.domain.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/motoristas")
public class MotoristasController {
    @Autowired
    private MotoristaService service;

    @GetMapping()
    public List<Motorista> get() {
        return service.getMotoristas();
    }

}
