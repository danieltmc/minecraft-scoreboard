package org.burkecommunitychurch.minecraftscoreboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcSupportConfig extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceRegistry) {
        if (!resourceRegistry.hasMappingForPattern("/webjars/**")) {
            resourceRegistry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        }

        if (!resourceRegistry.hasMappingForPattern("/swagger-ui/**")) {
            resourceRegistry
                .addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui")
                .resourceChain(false);
        }
    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewRegistry) {
        viewRegistry.addRedirectViewController("/swagger-ui.html", "/swagger-ui/index.html");
        viewRegistry.addRedirectViewController("/swagger-ui/", "/swagger-ui/inddex.html");
    }
}
