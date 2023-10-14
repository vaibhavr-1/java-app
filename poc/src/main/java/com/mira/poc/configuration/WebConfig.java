package com.mira.poc.configuration;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WebConfig {
    @Bean
    public FilterRegistrationBean<AWSXRayServletFilter> loggingFilter() {
        FilterRegistrationBean<AWSXRayServletFilter> registrationBean = new FilterRegistrationBean<AWSXRayServletFilter>();
        registrationBean.setFilter(new com.amazonaws.xray.javax.servlet.AWSXRayServletFilter());
        registrationBean.addUrlPatterns("*"); // URL patterns to filter
        return registrationBean;
    }
}
