package czs.study.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author czs
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceMain.class, args);
    }
}