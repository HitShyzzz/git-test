package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/07/28/9:52
 * @Description:
 */
@Configuration
public class student implements People {

    @Bean
    public student studentService() {
        return new student();
    }

}
