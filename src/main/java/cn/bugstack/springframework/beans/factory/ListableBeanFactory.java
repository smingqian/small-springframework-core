package cn.bugstack.springframework.beans.factory;

import cn.hutool.core.bean.BeanException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    String[] getBeanDefinitionNames();
}
