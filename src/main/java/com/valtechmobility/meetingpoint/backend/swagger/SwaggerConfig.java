package com.valtechmobility.meetingpoint.backend.swagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

@Configuration
@EnableSwagger2
@Slf4j
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return getDocket("default", PathSelectors.regex("/(?!v\\d+/).*")::apply);
    }

    @Bean
    public Docket apiV1() {
        return getDocketForApiVersion(1);
    }

    @Bean
    public Docket apiV2() {
        return getDocketForApiVersion(2);
    }

    private Docket getDocketForApiVersion(final int version) {
        return getDocket("APIv" + version, PathSelectors.regex("/v" + version + "/.*")::apply);
    }

    private Docket getDocket(final String groupName, final Predicate<String> pathSelector) {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(groupName)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(pathSelector::test)
                .build()
                .apiInfo(createApiInfo());
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("Meeting Point API")
                                   .contact(new Contact("Valtech Mobility GmbH",
                                                        "https://www.valtech-mobility.com",
                                                        "mailto:info@valtech-mobility.com"))
                                   .license("GNU GPLv3")
                                   .licenseUrl("https://opensource.org/licenses/GPL-3.0")
                                   .build();
    }

}
