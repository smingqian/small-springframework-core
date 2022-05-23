package springframework.beans.factory.support;

import springframework.beans.BeanException;
import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory  {
    @Override
    public Object getBean(String name) throws BeanException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;
    protected abstract Object createBean(String name,BeanDefinition beanDefinition) throws BeanException;
}
