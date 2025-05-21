package com.alyson.dependency_injection.controllers;

import com.alyson.dependency_injection.services.FauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final FauxService fauxService;

    @Autowired
    public FauxController(@Qualifier("fauxServiceImpl") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getDataSource() {
        return fauxService.getDataSource();
    }
}
