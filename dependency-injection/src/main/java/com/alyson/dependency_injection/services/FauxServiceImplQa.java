package com.alyson.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("fauxServiceImpl")
public class FauxServiceImplQa implements FauxService {
    @Override
    public String getDataSource() {
        return "QA";
    }
}
