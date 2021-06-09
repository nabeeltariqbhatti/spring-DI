package springjohnthompsonone.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springjohnthompsonone.di.service.HelloWorldService;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greetings = helloWorldService.getGreeting();
        System.out.println("greeeted  " + greetings);

        return greetings;
    }

}
