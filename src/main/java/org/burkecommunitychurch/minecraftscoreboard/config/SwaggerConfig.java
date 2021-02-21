package org.burkecommunitychurch.minecraftscoreboard.config;

import java.util.Collections;

import com.google.common.base.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    private static final Predicate<RequestHandler> IS_PROJECT_REQUEST_HANDLER = (Predicate<RequestHandler>) RequestHandlerSelectors
            .basePackage("org.burkecommunitychurch.minecraftscoreboard");

    private static final Predicate<String> IS_API_PATH = (Predicate<String>) PathSelectors.ant("/api/**");

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("BCC Minecraft Scoreboard")
            .description("List scores for MCBCC minigames.")
            .version("1.0.0")
            .termsOfServiceUrl("https://burkecommunity.com/about/mission-vision-values")
            .contact(contactInfo())
            .license("Copyright (c) 2021, Daniel McCloskey. All rights reserved.")
            .licenseUrl("danieltmc.com")
            .extensions(Collections.emptyList())
            .build();
    }

    private static Contact contactInfo() {
        return new Contact(
            "Daniel McCloskey",
            "danieltmc.com",
            "me@danieltmc.com"
        );
    }

    @Bean
    public Docket api() {
        // return new Docket(DocumentationType.SWAGGER_2).select()
        //         .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
        //         .paths((Predicate<String>) PathSelectors.any())
        //         .build();
        // return new Docket(DocumentationType.SWAGGER_2)
        //     .apiInfo(apiInfo());
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .genericModelSubstitutes(ResponseEntity.class)
            .useDefaultResponseMessages(false)
            .select()
            .apis(IS_PROJECT_REQUEST_HANDLER)
            .paths(IS_API_PATH)
            .build();
    }
}
