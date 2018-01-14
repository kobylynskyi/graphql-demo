package com.kobylynskyi.pharmacy;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PharmacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PharmacyApplication.class, args);
    }

    @Bean
    public GraphQLSchema schema() {
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .build().makeExecutableSchema();
    }

}
