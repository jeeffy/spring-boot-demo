package com.jeeffy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docketBean() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo("Demo"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jeeffy"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(String title) {
        return new ApiInfoBuilder()
                .title(title)
                .build();
    }

    @Bean
    public Docket openApi() {
        return docket(
                "open-api",
                "对外服务API",
                "^/api.*"
        );
    }

    @Bean
    public Docket taskApi() {
        return docket(
                "task",
                "任务相关API",
                "^/task.*"
        );
    }

    private Docket docket(String groupName, String title, String pathRegex) {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(groupName).apiInfo(apiInfo(title))
                .ignoredParameterTypes(ApiIgnore.class)
                .select()
                .paths(regex(pathRegex))
                .build();
    }
}
