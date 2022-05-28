package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.PropertyValues;
import cn.hutool.core.bean.BeanException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {
    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeanException
     */
    Object postProcessBeforeInitialization(Class<?> beanClass, String beanName) throws BeanException;


    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeanException;


    /**
     * 在Bean对象完成实例化后，设置属性前执行该方法
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeanException;
}
