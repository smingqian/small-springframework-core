package cn.bugstack.springframework.beans.factory.config;

import cn.hutool.core.bean.BeanException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{
    Object postProcessBeforeInitialization(Class<?> beanClass, String beanName) throws BeanException;
}
