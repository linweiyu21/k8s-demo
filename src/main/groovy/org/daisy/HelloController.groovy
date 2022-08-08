package org.daisy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import reactor.core.publisher.Mono

@Controller("/hello")
class HelloController {
    
    @Get(uri = "/", produces = "text/plain")
    Mono<String> index() {
        Mono.just 'fuck you'
    }
}