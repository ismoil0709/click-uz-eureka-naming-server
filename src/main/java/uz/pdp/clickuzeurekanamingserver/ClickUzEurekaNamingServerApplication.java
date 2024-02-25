package uz.pdp.clickuzeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClickUzEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickUzEurekaNamingServerApplication.class, args);
    }

}
