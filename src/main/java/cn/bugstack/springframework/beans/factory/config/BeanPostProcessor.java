package cn.bugstack.springframework.beans.factory.config;

import cn.hutool.core.bean.BeanException;

public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeanException;
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeanException;

}
