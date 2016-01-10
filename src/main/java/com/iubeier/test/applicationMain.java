package com.iubeier.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jankie on 16/1/10.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class applicationMain {

    public static void main(String[] args) {
        SpringApplication.run(applicationMain.class);
    }
}
