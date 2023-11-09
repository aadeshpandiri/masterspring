package com.example.masterspring.springworkexample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{
    //Type 1 : Field Autowiring
    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    //Type 2 : Autowiring using setter
//    @Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1 ");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2 ");
//		this.dependency2 = dependency2;
//	}

    //Type 3 : Autowiring using constructor ,  Autowired Annotation is optional
    //Recommended
    @Autowired
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        super();
        this.dependency1=dependency1;
        this.dependency2=dependency2;
    }


    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{
}

@Component
class Dependency2{
}

@Configuration
@ComponentScan
public class simplespringlauncher {
    public static void main(String [] args){
        try(var context = new AnnotationConfigApplicationContext(simplespringlauncher.class)){
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));

        }
    }
}
