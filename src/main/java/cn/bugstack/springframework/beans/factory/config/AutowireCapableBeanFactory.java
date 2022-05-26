package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.factory.BeanFactory;
import cn.hutool.core.bean.BeanException;

import javax.management.ObjectName;

public interface AutowireCapableBeanFactory extends BeanFactory {
    /**
     * 执行BPP接口实现的postProcessBeforeInitialization方法
     *
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean,String beanName) throws BeanException;

    /**
     * 执行BPP接口实现的postProcessorsAfterInitialization方法
     *
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean,String beanName) throws BeanException;
}
