package com.lbenavides.tenantproperty.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
@Service
@ConditionalOnProperty(prefix = "app",name = "language", havingValue = "ES")
public class SpanishSalute implements SaluteService {

    private static final Logger logger = LoggerFactory.getLogger(SpanishSalute.class);

    public SpanishSalute() {
        logger.info("SPANISH CREATED");
    }

    @Override
    public String salute(String name) {
        return String.format("Hola %s", name);
    }
}
