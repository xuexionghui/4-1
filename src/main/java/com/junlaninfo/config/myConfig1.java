package com.junlaninfo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  //这是一个配置类
@PropertySource(value="classpath:test.properties")
@ConfigurationProperties(prefix="com.junlaninfo")
public class myConfig1 {
      private String   name;
      private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
       
}
