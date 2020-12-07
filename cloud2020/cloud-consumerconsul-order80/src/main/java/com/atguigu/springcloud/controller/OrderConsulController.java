package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by 卢可欢 on 2020/11/29.
 */
@RestController
@Slf4j
public class OrderConsulController {
    public final String INVOKE_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("consumer/payment/consul")
    public String paymentInfo(){
        String result=restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
