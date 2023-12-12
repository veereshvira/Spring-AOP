package com.diksha;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.diksha")
@EnableAspectJAutoProxy
public class BeanConfig {
	

}
