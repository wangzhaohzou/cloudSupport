package com.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author wangzhaozhou
 * @date 2019/12/30
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CloudSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSupportApplication.class, args);
    }

}
