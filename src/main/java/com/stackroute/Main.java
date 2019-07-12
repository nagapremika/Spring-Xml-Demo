package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Main {
    public static void main(String[] args) {

//       Dependency injection using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      Movie movie1=context.getBean("movie1",Movie.class);     //Injecting movie1 by using autowire=byName
        movie1.display();
       Movie movie2=context.getBean("movie2",Movie.class);        //Injecting movie2 using constructor injection
        movie2.display();





    }
}
