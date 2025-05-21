package com.alyson.dependency_injection.services.i18n;

import com.alyson.dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18NService")
public class PortugueseGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Olá Mundo!";
    }
}
