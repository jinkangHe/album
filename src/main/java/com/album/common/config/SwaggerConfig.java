package com.album.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/5/20 16:57
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            // 自行修改为自己的包路径
            .apis(RequestHandlerSelectors.basePackage("com.album.app.controller"))
            .paths(PathSelectors.any())
            .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("api文档")
            .description("restful 风格接口")
            //服务条款网址
            //.termsOfServiceUrl("")
            .version("1.0")
            //.contact(new Contact("hello", "url", "email"))
            .build();
  }

}
