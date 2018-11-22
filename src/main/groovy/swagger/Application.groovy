package swagger

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.servers.Server

@OpenAPIDefinition(
        info = @Info(
                title = "Test API",
                version = "1.0.0",
                description = "Test API blah"
        )
)
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}