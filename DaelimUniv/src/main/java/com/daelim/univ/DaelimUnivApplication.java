package com.daelim.univ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = DaelimUnivApplication.class)
@SpringBootApplication
public class DaelimUnivApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaelimUnivApplication.class, args);
	}

}
