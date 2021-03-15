package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class HelloFunction implements Function<Flux<User>, Flux<Greeting>> {

    public Flux<Greeting> apply(Flux<User> flux) {
        return flux.map(user -> new Greeting("Hello, " + user.getName() + "!\n"));
    }
}
