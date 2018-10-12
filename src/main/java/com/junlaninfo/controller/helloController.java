package com.junlaninfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    /*
     *  第一个方法访问springboot
     */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String   index() {
		return "I am the first springbootApplication";
	}
	
	/*
	 * 从默认的配置文件中application.properties，读取里面属性的值
	 */
	@Value("${my.name}")
	private String name;
	@Value("${my.age}")
	private int age;
	@RequestMapping(value="/myapp",method=RequestMethod.GET)
	public String  resourcesFromapplication() {
		return name+":"+age;
	}
}
