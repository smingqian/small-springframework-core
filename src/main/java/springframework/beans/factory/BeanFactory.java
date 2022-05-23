package springframework.beans.factory;

import springframework.beans.BeanException;

public interface BeanFactory {

    Object getBean(String name) throws BeanException;

}
