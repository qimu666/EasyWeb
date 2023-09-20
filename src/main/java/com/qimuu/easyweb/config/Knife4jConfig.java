package com.qimuu.easyweb.config;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * Knife4j 接口文档配置
 * <a href="https://doc.xiaominfo.com/knife4j/documentation/get_start.html">...</a>
 *
 * @author QiMu
 */
@Configuration
@EnableSwagger2
@Profile("!prod")
@Data
@ConfigurationProperties("knife4j.config")
public class Knife4jConfig {
    /**
     * 标题
     */
    private String title = "接口文档";
    /**
     * 描述信息
     */
    private String description;
    /**
     * 版本信息
     */
    private String version = "1.0";
    /**
     * Controller 扫描包路径
     */
    private String scanPath;
    /**
     * 作者
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * url
     */
    private String url;

    @Bean
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title(title)
                        .contact(new Contact(name, url, email))
                        .description(description)
                        .version(version)
                        .build())
                .select()
                // 指定 Controller 扫描包路径
                .apis(selector(scanPath))
                .paths(PathSelectors.any()).build();
    }


    /**
     * 路径选择器
     *
     * @param scanPath 扫描路径
     * @return {@link Predicate}<{@link RequestHandler}>
     */
    private Predicate<RequestHandler> selector(String scanPath) {
        if (StringUtils.isBlank(scanPath)) {
            return RequestHandlerSelectors.withClassAnnotation(RestController.class)
                    .or(RequestHandlerSelectors.withClassAnnotation(Controller.class));
        }
        return RequestHandlerSelectors.basePackage(scanPath);
    }
}