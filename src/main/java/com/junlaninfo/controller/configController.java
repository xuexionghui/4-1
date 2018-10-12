package com.junlaninfo.controller;

import javax.annotation.Resource;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.junlaninfo.config.myConfig;
import com.junlaninfo.config.myConfig1;

@RestController
@EnableConfigurationProperties({myConfig.class,myConfig1.class})
public class configController {
	/*
	 * 将application.properties的属性赋值给Javabean
	 */
	@Resource(name="myConfig")
	private myConfig  my;
	@RequestMapping("/config")
	public String config() {
		return my.getName()+":"+my.getAge()+":"+my.getUuid()+":"+my.getNumber();
	}
	
	/*
	 * 将自定义的test.properties文件中的属性，注入到Javabean中
	 */
	@Resource(name="myConfig1")
	private myConfig1   me;
	@RequestMapping(value="/config1",method=RequestMethod.GET)
	public String   config1() {
		return me.getName()+":"+ me.getAge();
	}
	

}
