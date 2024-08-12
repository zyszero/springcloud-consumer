package io.github.zyszero.phoenix.sc.contract;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zyszero
 * @Date: 2024/8/12 20:24
 */
//@FeignClient(name = "helloService")
public interface HelloServiceClient extends UserServiceClient {


    // ==== hello api
    @GetMapping("/api/hello")
    String hello();

    @GetMapping("/api/a")
    String a(@RequestParam("name") String name);

    @GetMapping("/api/b")
    String b(@RequestParam("name") String name);




    // === user api
//    @GetMapping("/api/user/list")
//    String list(@RequestParam("name") String name);
//
//    @GetMapping("/api/user/find")
//    String find(@RequestParam("name") String name);
}
