package com.example.demo;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableNacosConfig
@NacosPropertySource(dataId = "demo", groupId = "DEMO", type = ConfigType.YAML, autoRefreshed = true)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}