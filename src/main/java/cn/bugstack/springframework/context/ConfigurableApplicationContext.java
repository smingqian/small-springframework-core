package cn.bugstack.springframework.context;

import cn.hutool.core.bean.BeanException;

public interface ConfigurableApplicationContext extends ApplicationContext{
    void refresh() throws BeanException;
}
