package com.qimuu.easyweb.config;

import com.qimuu.easyweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author QiMu
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class,})
public class MyAutoConfiguration {
}