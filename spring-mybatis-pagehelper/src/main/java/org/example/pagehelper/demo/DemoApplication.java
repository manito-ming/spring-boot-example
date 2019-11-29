package org.example.pagehelper.demo;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@MapperScan("org.example.pagehelper.demo.dao")
@SpringBootApplication
public class DemoApplication {
//Caused by: org.yaml.snakeyaml.error.YAMLException: java.nio.charset.MalformedInputException: Input length = 2
    //转换下编码格式,转换为utf8或者gbk
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
