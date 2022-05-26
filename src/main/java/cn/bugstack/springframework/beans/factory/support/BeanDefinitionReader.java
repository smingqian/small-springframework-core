package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.cores.io.Resource;
import cn.bugstack.springframework.cores.io.ResourceLoader;
import cn.hutool.core.bean.BeanException;

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;

    void loadBeanDefinitions(String... locations) throws BeanException;

}
