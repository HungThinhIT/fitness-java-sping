package com.minhchieu.config;

import com.minhchieu.interceptor.CustomerInterceptor;
import com.minhchieu.interceptor.TeacherInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ServiceInterceptorAppConfig implements WebMvcConfigurer {

    @Autowired
    TeacherInterceptor teacherInterceptor;
    @Autowired
    CustomerInterceptor customerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(teacherInterceptor);
        registry.addInterceptor(customerInterceptor);
    }
}
