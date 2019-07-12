package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//       Dependency injection using ApplicationContext
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      Movie movie1=context.getBean("movie1",Movie.class);     //Injecting movie1 by using autowire=byName
        movie1.display();

context.close();        // closes the context such that bean is destroyed

    }
}
