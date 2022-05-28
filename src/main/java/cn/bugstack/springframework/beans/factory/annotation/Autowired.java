package cn.bugstack.springframework.beans.factory.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {

}
