package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello-world")
public class HelloWorldController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public Data helloWorld() {
        return new Data("Hello World!");
    }

    private class Data {

        private final String message;

        public Data(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
