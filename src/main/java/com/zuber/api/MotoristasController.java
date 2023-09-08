package com.zuber.api;

import com.zuber.domain.Motorista;
import com.zuber.domain.MotoristaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/motoristas")
public class MotoristasController {
    private MotoristaService service = new MotoristaService();

    @GetMapping()
    public List<Motorista> get() {
        return service.getMotoristas();
    }

}
