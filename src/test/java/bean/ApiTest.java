package bean;

import org.junit.Test;
import springframework.BeanDefinition;
import springframework.BeanFactory;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new StudentService());
        beanFactory.registerBeanDefinition("studentService",beanDefinition);

        StudentService studentService = (StudentService)beanFactory.getBean("studentService");
        studentService.queryStudentInfo();
    }
}
