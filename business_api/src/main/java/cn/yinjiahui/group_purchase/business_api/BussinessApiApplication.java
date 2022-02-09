package cn.yinjiahui.group_purchase.business_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BussinessApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BussinessApiApplication.class, args);
    }
}


