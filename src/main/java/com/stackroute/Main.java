package com.stackroute;


import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//       Dependency injection using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie1",Movie.class);     //Injecting movie1
        movie1.display();
        Movie movie2=context.getBean("movie2",Movie.class);        //Injecting movie2
        movie2.display();
        Movie movie3=context.getBean("movie3",Movie.class);         //Injecting movie3
        movie3.display();
        System.out.println(movie2==movie3);               //  Comparing movie2 and movie3
        Movie movie4=context.getBean("movie4",Movie.class);     //Injecting movie4
        movie4.display();
        Movie movie5=context.getBean("movie5",Movie.class);     //Injecting movie5
        movie5.display();
        System.out.println(movie4==movie5);




    }
}
