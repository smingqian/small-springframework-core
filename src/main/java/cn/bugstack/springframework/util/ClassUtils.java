package cn.bugstack.springframework.util;

public class ClassUtils {
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {

        }
        if (classLoader == null) {
            classLoader = ClassLoader.class.getClassLoader();
        }
        return classLoader;
    }
    public static boolean isCglibProxyClass(Class<?> clazz){
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }

    private static boolean isCglibProxyClassName(String className) {
        return (className != null && className.contains("$$"));

    }

}
