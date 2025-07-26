package com.lone.lonethumb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.lone.lonethumb.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableScheduling
public class LoneThumbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoneThumbApplication.class, args);
	}

}
