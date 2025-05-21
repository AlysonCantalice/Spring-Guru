package com.alyson.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("fauxServiceImpl")
public class FauxServiceImplDev implements FauxService {
    @Override
    public String getDataSource() {
        return "DEV";
    }
}
