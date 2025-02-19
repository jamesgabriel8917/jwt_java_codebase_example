package jwt_auth.aula.jwt.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {


    //link padrão do swagger
    //http://localhost:8080/swagger-ui/index.html
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Data Service API")
                        .version("1.0")
                        .description("Documentação da API usando Springdoc OpenAPI"));
    }
}
