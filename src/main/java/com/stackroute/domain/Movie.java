package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;
    public void display()
    {
        actor.display();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Created using BeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Created using BeanName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Created using ApplicationContext");
    }
}
