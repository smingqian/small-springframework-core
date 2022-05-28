package cn.bugstack.springframework.test;

import cn.bugstack.springframework.aop.AdvisedSupport;
import cn.bugstack.springframework.aop.ClassFilter;
import cn.bugstack.springframework.aop.MethodMatcher;
import cn.bugstack.springframework.aop.TargetSource;
import cn.bugstack.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.bugstack.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import cn.bugstack.springframework.aop.framework.ProxyFactory;
import cn.bugstack.springframework.aop.framework.ReflectiveMethodInvocation;
import cn.bugstack.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import cn.bugstack.springframework.context.support.ClassPathXmlApplicationContext;
import cn.bugstack.springframework.test.bean.IUserService;
import cn.bugstack.springframework.test.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ApiTest {
    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }
}
