package com.campy.projecteureka2;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProjectEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectEureka2Application.class, args);
    }

}
