package io.github.zyszero.phoenix.sc.consumer;

import io.github.zyszero.phoenix.sc.contract.HelloServiceClient;
import io.github.zyszero.phoenix.sc.contract.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {
        "io.github.zyszero.phoenix.sc"
})
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

    @Autowired
    DemoClient helloServiceClient;


    @Bean
    ApplicationRunner runner() {
        return args -> {
            String hello = helloServiceClient.hello();
            System.out.println(" ==> helloService.hello : " + hello);

            hello = helloServiceClient.a("zyszero");
            System.out.println(" ==> helloService.a : " + hello);


            hello = helloServiceClient.b("zzz");
            System.out.println(" ==> helloService.b : " + hello);

            hello = helloServiceClient.list("zhangsan");
            System.out.println(" ==> helloService.list : " + hello);
        };
    }
}
