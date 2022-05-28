package cn.bugstack.springframework.aop;

import cn.bugstack.springframework.util.ClassUtils;

/**
 * 被代理的目标对象
 */
public class TargetSource {
    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass() {
        Class<?> clazz = this.target.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
        return clazz.getInterfaces();    }

    public Object getTarget() {
        return this.target;
    }
}
