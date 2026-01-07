package com.Annotaions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Replaces the XML
@ComponentScan(basePackages = "project.demo") //Finds the @Component auto

public class AppConfig {

}