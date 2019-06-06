package com.hxq.violation;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan(value = "com.hxq.violation.mapper")
public class UserShanghaiApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserShanghaiApplication.class, args);
		System.out.println("上海服务开启了。。。");

	}

}
