package kz.eserzhanov.microservice.entrypoint.eureka.entry_point_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EntryPointEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntryPointEurekaApplication.class, args);
    }

}
