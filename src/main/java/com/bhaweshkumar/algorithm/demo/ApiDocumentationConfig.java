package com.bhaweshkumar.algorithm.demo;

import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
        info = @Info(
                description = "Algorithms demo",
                version = "V0.1",
                title = "Algorithms API documentation",
                contact = @Contact(
                        name = "Bhawesh Kumar",
                        email = "architect_bhawesh@outlook.com",
                        url = "https://www.bhaweshkumar.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}
)
public interface ApiDocumentationConfig {

}
