package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import cn.bugstack.springframework.beans.factory.config.BeanPostProcessor;
import cn.bugstack.springframework.beans.factory.config.ConfigurableBeanFactory;
import cn.hutool.core.bean.BeanException;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory , AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    void preInstantiateSingletons() throws BeanException;

    @Override
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
