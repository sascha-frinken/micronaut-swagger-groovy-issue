package swagger;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class TestController {

    @Get("/")
    public TestResponse index() {
        return new TestResponse("test");
    }
}