package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry{
    private final Map<String,Object> factoryBeanObjectCache = new ConcurrentHashMap<>();

    protected Object getCachedObjectForFactoryBean(String beanName){
        Object o = this.factoryBeanObjectCache.get(beanName);
        return (o != NULL_OBJECT ? o : null);
    }
    protected Object getObjectFromFactoryBean(FactoryBean factory,String beanName){
        if (factory.isSingleton()){
            Object object = this.getCachedObjectForFactoryBean(beanName);
            if (null == object){
                object = doGetObjectFromFactoryBean(factory,beanName);
                this.factoryBeanObjectCache.put(beanName,(object != null ? object:NULL_OBJECT));
            }
            return object;
        }else {
            return doGetObjectFromFactoryBean(factory,beanName);
        }
    }

    protected Object doGetObjectFromFactoryBean(FactoryBean factory, String beanName){
        try {
            return factory.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean throw exception on object["+beanName+"] create",e);
        }
    }
}
