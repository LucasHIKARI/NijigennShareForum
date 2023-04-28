package com.music.forum.filter;


import com.music.forum.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;


    public void addInterceptors(InterceptorRegistry registry) {
//        boot写法：
//        List<String> excludeArr = new ArrayList<String>();
//        excludeArr.add("/**/*login*/**");
//        excludeArr.add("/**/*reg*/**");
//        excludeArr.add("/static/**");
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(excludeArr);

        String[] excludeArr = new String[10];
        excludeArr[0]="/**/*login*/**";
        excludeArr[1]="/**/*reg*/**";
        excludeArr[2]="/static/**";
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(excludeArr);
    }
//    在Spring Boot中，大多数常用的配置都有默认实现，因此如果我们不需要特别的配置，可以直接使用默认的实现，而无需重写这些方法。
//    对于addFormatters、configureMessageConverters和extendMessageConverters等方法，这些方法都是用于对请求和响应进行格式化和转换的，
//    如果我们不需要自定义格式化和转换规则，则可以直接使用默认实现，因此可以不必重写这些方法。

    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }



    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

    }

    //
}
