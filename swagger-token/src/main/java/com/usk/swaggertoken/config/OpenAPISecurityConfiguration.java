package com.usk.swaggertoken.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Order-Service API",
    version = "1.0",
    contact = @Contact(
      name = "DDIS", email = "santhosh.u@ddis.com", url = "https://www.ddis.com"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    )
  )
)
public class OpenAPISecurityConfiguration {

}
