package com.bezy.demo;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String dsn = args[0];
        Sentry.init(dsn);
        SpringApplication.run(DemoApplication.class, args);
    }

}
