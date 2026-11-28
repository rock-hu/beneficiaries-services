package com.openbanking.beneficiaries.configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public GroupedOpenApi actuatorGroup() {
        return GroupedOpenApi.builder()
                .group("actuator")
                .pathsToMatch("/actuator/**")
                .build();
    }

    @Bean
    public GroupedOpenApi apiGroup(@Autowired Artifact artifact) {
        return GroupedOpenApi.builder()
                .group("beneficiaries-services")
                // .addOpenApiCustomizer(openApi -> openApi.info(new Info()
                //         .title(StringUtils.join(
                //                 new String[] {artifact.getGroupId(), artifact.getArtifactId(),
                // artifact.getVersion()},
                //                 ":"))
                //         .version(artifact.getVersion())))
                .packagesToScan("com.openbanking.beneficiaries.controller")
                .build();
    }
}
