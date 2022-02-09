package cn.yinjiahui.group_purchase.consumer_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApiApplication.class, args);
    }
}


