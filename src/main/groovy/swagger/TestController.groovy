package swagger

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/test")
class TestController {

    @Get("/")
    TestResponse index() {
        return new TestResponse("test")
    }
}