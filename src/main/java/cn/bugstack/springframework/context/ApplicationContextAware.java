package cn.bugstack.springframework.context;

import cn.bugstack.springframework.beans.factory.Aware;
import cn.hutool.core.bean.BeanException;

public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeanException;
}
