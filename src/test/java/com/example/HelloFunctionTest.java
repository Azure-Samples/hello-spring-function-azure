package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloFunctionTest {

    @Test
    public void test() {
        Mono<Greeting> result = new HelloFunction().apply(Mono.just(new User("foo")));
        assertThat(result.block().getMessage()).isEqualTo("Hello, foo!\n");
    }

    @Test
    public void start() {
        AzureSpringBootRequestHandler<User, Greeting> handler = new AzureSpringBootRequestHandler<>(
                HelloFunction.class);
        Greeting result = handler.handleRequest(new User("foo"), null);
        handler.close();
        assertThat(result.getMessage()).isEqualTo("Hello, foo!\n");
    }
}
