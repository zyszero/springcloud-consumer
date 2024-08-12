package io.github.zyszero.phoenix.sc.consumer;

import io.github.zyszero.phoenix.sc.contract.HelloServiceClient;
import io.github.zyszero.phoenix.sc.contract.UserServiceClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: zyszero
 * @Date: 2024/8/12 20:56
 */
@FeignClient("helloService")
public interface DemoClient extends HelloServiceClient {
}
