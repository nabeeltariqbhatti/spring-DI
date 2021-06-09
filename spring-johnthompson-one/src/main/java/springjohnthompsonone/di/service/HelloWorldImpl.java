package springjohnthompsonone.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"english", "default"})
public class HelloWorldImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        // TODO Auto-generated method stub
        return "Hello World from Spring Boot";
    }

}
