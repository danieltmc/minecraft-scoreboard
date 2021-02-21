package org.burkecommunitychurch.minecraftscoreboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@Import(SpringfoxWebMvcConfiguration.class)
public class SwaggerConfig {
    @Bean
    public Docket api() {
        // return new Docket(DocumentationType.SWAGGER_2).select()
        //         .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
        //         .paths((Predicate<String>) PathSelectors.any())
        //         .build();
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
            "BCC Minecraft Scoreboard",
            "List scores for MCBCC minigames.",
            "1.0.0",
            "N/A",
            new Contact("Daniel McCloskey", "danieltmc.com", "me@danieltmc.com"),
            "N/A",
            "N/A",
            null
        );
        return apiInfo;
    }
}
