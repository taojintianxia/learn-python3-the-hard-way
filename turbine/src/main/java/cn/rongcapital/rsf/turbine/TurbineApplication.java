package cn.rongcapital.rsf.turbine;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableTurbine
@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
public class TurbineApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
    }
}
