package ynu.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import ynu.edu.rule.CustomThreeTimeLoadBalanceConfig;

//@LoadBalancerClient(name="provider-service",configuration = CustomThreeTimeLoadBalanceConfig.class)
@SpringBootApplication
@EnableFeignClients

public class ConsumerApplication16001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication16001.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
