package com.qimuu.eazyweb.config;

import com.qimuu.eazyweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author qimu
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class})
public class MyAutoConfiguration {
}