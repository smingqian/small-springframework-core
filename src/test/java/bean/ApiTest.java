package bean;

import org.junit.Test;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.DeafultListableBeanFactory;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        DeafultListableBeanFactory beanFactory = new DeafultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(StudentService.class);

        beanFactory.registerBeanDefinition("studentService",beanDefinition);

        StudentService studentService = (StudentService)beanFactory.getBean("studentService");
        studentService.queryStudentInfo();

    }
}
