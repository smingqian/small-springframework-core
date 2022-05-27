package cn.bugstack.springframework.beans;

import cn.bugstack.springframework.beans.factory.Aware;
import cn.bugstack.springframework.beans.factory.BeanFactory;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
