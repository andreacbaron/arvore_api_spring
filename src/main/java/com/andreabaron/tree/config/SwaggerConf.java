package com.andreabaron.tree.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.text.html.Option;
import java.util.List;

@Configuration
public class SwaggerConf {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Arvore Spring")
                        .description("API Rest Arvore")
                        .contact(new Contact()
                                .name("Time BAck-End")
                                .email("andrea.acb@gmail.com")
                        )
                        .license(new License()

                                .name("Apache 2.0")
                                .url("http://arvore/license")
                        )
                )
                .servers(List.of(new Server()
                        .url("http://localhost:8080"))
                )
                .tags(List.of(new Tag()
                        .name("API arvore")
                        .description("API Rest Arvore")
                ));
    }

}
