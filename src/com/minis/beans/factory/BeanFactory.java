package com.minis.beans.factory;

import com.minis.beans.BeanDefinition;
import com.minis.beans.BeansException;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;

    boolean containsBean(String name);

    void registerBean(String beanName, Object obj);

    void registerBeanDefinition(BeanDefinition beanDefinition);

}
