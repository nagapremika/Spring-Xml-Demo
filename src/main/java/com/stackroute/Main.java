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

//        Dependency injection using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.display();

//        Dependency Injection using BeanFactory
        ClassPathResource res = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(res);
        Movie movie2=beanFactory.getBean("movie2",Movie.class);
        movie2.display();

//        Dependency injection using BeanDefaultRegistry and BeanDefinitionReader
        DefaultListableBeanFactory defaultListableBeanFactory=new DefaultListableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry=new GenericApplicationContext( defaultListableBeanFactory);
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions("beans.xml");
        Movie movie3=beanFactory.getBean("movie3",Movie.class);
        movie3.display();



    }
}
