package springframework.beans.factory.support;

import springframework.beans.BeanException;
import springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeanException {
        Object bean;
        try {
            bean =  beanDefinition.getBean().newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new BeanException("Instantiation of bean failed",e);
        }
        addSingleton(name,bean);
        return bean;
    }
}
