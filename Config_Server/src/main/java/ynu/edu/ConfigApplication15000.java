package ynu.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import ynu.edu.rule.CustomThreeTimeLoadBalanceConfig;


@SpringBootApplication
//@EnableFeignClients
@LoadBalancerClient(name="provider-service",configuration = CustomThreeTimeLoadBalanceConfig.class)
public class ConfigApplication15000 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication15000.class, args);
    }
}


