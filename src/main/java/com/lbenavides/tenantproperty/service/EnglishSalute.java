package com.lbenavides.tenantproperty.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "app", name = "language", havingValue = "EN", matchIfMissing = true)
public class EnglishSalute implements SaluteService {
    private static final Logger logger = LoggerFactory.getLogger(EnglishSalute.class);

    public EnglishSalute() {
        logger.info("ENGLISH CREATED");
    }

    @Override
    public String salute(String name) {
        return String.format("Hello %s ", name);
    }
}
