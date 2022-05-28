package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.factory.HierarchicalBeanFactory;
import cn.bugstack.springframework.util.StringValueResolver;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

    /**
     * Add a String resolver for embedded values such as annotation attributes.
     */
    void addEmbeddedValueResolver(StringValueResolver stringValueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute.
     */
    String resolveEmbeddedValue(String value);
}
