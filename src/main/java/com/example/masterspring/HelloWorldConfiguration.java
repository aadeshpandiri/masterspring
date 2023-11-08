package com.example.masterspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){}

record Address(String firstLine, String city){ };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Aadesh";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        return new Person("Bubu",22,new Address("Alwal","Hyderabad"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name,int age,Address address3){
        return new Person(name,age,address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Theatre Road","Hyd");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Sai Ram Towers", "HYD");
    }
}
