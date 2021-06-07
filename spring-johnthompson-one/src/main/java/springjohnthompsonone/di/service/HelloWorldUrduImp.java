package springjohnthompsonone.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("urdu")
public class HelloWorldUrduImp implements HelloWorldService {

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello Dunia";
	}

}
