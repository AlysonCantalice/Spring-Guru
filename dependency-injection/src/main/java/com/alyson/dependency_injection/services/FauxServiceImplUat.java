package com.alyson.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("fauxServiceImpl")
public class FauxServiceImplUat implements FauxService {
    @Override
    public String getDataSource() {
        return "UAT";
    }
}
