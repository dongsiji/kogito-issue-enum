package org.kie.kogito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.kie.kogito.**", "http*"})
public class Kogito {

    public static void main(final String[] args) {
        SpringApplication.run(Kogito.class, args);
    }
}
