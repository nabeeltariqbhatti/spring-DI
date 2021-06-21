package springjohnthompsonone.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
    private HelloWorldService hellowWorldService;

    @Autowired
    public InjectedByConstructorService(HelloWorldService hellowWorldService) {
        this.hellowWorldService = hellowWorldService;
    }

    public void getMessage() {
        hellowWorldService.sayHello();
    }

}
