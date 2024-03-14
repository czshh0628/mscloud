package czs.study.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author czs
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelGatewayMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelGatewayMain.class, args);
    }
}