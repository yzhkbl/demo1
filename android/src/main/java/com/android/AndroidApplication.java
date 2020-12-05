package com.android;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.android.Dao")
public class AndroidApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndroidApplication.class, args);
	}

}
