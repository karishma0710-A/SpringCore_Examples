package com.Spring_IOC;

public class App {
    public static void main( String[] args )
   
    {
    	//Load Spring XML Configuration
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       
       //Get the welcome bean from Spring container
       Cn_Flight obj = (Cn_Flight)context.getBean("welcome");
       
       //Display the injected message
       System.out.println(obj.getMessage());
    }
}