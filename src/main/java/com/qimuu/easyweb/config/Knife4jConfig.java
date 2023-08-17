package com.qimuu.easyweb.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Knife4j 接口文档配置
 * <a href="https://doc.xiaominfo.com/knife4j/documentation/get_start.html">...</a>
 *
 * @author QiMu
 */
@Configuration
@EnableSwagger2
@Profile({"dev", "test"})
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
    private String description = "";
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
    private String name = "";

    /**
     * 邮箱
     */
    private String email = "";

    @Bean

    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title(title)
                        .contact(new Contact(name, "", email))
                        .description(description)
                        .version(version)
                        .build())
                .select()
                // 指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage(scanPath)).paths(PathSelectors.any()).build();
    }
}