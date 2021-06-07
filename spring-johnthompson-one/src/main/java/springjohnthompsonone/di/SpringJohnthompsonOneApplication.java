package springjohnthompsonone.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springjohnthompsonone.di.controller.GreetingController;

@SpringBootApplication
public class SpringJohnthompsonOneApplication {

	public static void main(String[] args) {

		ApplicationContext cxt = SpringApplication.run(SpringJohnthompsonOneApplication.class, args);

		InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) cxt
				.getBean("injectedByConstructorService");
		injectedByConstructorService.getMessage();
		SetterBasedService setterBasedService = (SetterBasedService) cxt.getBean("setterBasedService");
		setterBasedService.getMessage();

		GreetingController controller = (GreetingController) cxt.getBean("greetingController");

		System.out.println(controller.sayHello());
	}

}
