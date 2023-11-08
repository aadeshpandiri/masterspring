package com.example.masterspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    //Primary Annotation will declare bean as default one ,
    // so while conflict occurs this bean apply by default
    public Person person4Parameters(String name, int age, Address address) {
        //name,age,address2
        return new Person(name, age, address); //name, age
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        //name,age,address2
        return new Person(name, age, address); //name, age
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Theatre Road","Hyd");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Sai Ram Towers", "HYD");
    }
}
