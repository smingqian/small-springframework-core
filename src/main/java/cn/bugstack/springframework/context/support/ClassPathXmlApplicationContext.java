package cn.bugstack.springframework.context.support;

import cn.hutool.core.bean.BeanException;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    private String[] configLocations;

    public ClassPathXmlApplicationContext(String[] configLocations){
        this.configLocations = configLocations;
        refresh();
    }
    public ClassPathXmlApplicationContext(String configLocations) throws BeanException {
        this(new String[]{configLocations});
    }

    @Override
    protected String[] getConfigLocation() {
        return configLocations;
    }
}
