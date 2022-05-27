package cn.bugstack.springframework.context.event;

import cn.bugstack.springframework.context.ApplicationEvent;
import cn.bugstack.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {
    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
