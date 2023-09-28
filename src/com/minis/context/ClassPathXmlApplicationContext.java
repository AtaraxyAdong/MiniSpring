package com.minis.context;

import com.minis.beans.BeanDefinition;
import com.minis.beans.BeansException;
import com.minis.beans.factory.BeanFactory;
import com.minis.beans.factory.config.SimpleBeanFactory;
import com.minis.beans.factory.xml.XmlBeanDefinitionReader;
import com.minis.core.ClassPathXmlResource;
import com.minis.core.Resource;

public class ClassPathXmlApplicationContext implements BeanFactory, ApplicationEventPublisher {
    SimpleBeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        Resource res = new ClassPathXmlResource(fileName);
        SimpleBeanFactory simpleBeanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(simpleBeanFactory);
        reader.loadBeanDefinitions(res);
        this.beanFactory = simpleBeanFactory;
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        return this.beanFactory.getBean(beanName);
    }

    @Override
    public boolean containsBean(String name) {
        return this.beanFactory.containsBean(name);
    }

    public void registerBean(String beanName, Object obj) {
        this.beanFactory.registerBean(beanName, obj);
    }

    @Override
    public void publishEvent(ApplicationEvent event) {
    }

    @Override
    public boolean isSingleton(String name) {
        return this.beanFactory.getBeanDefinition(name).isSingleton();
    }

    @Override
    public boolean isPrototype(String name) {
        return this.beanFactory.getBeanDefinition(name).isPrototype();
    }

    @Override
    public Class<?> getType(String name) {
        return this.beanFactory.getType(name);
    }

}
