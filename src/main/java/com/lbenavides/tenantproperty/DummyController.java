package com.lbenavides.tenantproperty;

import com.lbenavides.tenantproperty.service.SaluteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salute")
public class DummyController {


    private final SaluteService saluteService;

    public DummyController(SaluteService saluteService) {
        this.saluteService = saluteService;
    }

    @GetMapping("{name}")
    public String saluteByName(@PathVariable String name) {
        return saluteService.salute(name);
    }


}
