package springjohnthompsonone.di;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements HelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("Hello World");

    }

}
