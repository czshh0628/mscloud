package czs.study.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author czs
 */
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("czs.study.mscloud.mapper")
@SpringBootApplication
public class SeataAccountMainApp {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMainApp.class, args);
    }
}