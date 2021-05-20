package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	
    	
//    	 
   	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	
//    	
//    	Vehicle v = (Vehicle) context.getBean("vehicle");
//    	
//    	v.drive();
//    	v = new Bike();
    	
    	Tyre tyre=(Tyre) context.getBean("tyre");
    	
    	System.out.println(tyre.getBrand());
    
        System.out.println( "Hello World!" );
    }
}
