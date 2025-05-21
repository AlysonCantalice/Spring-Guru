package com.alyson.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("fauxServiceImpl")
public class FauxServiceImplProd implements FauxService {
    @Override
    public String getDataSource() {
        return "PROD";
    }
}
