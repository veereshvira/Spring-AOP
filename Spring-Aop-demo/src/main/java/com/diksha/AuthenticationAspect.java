package com.diksha;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("within(com.diksha..*)")
	public void authenticatingPointcut() {
		
	}
	
	@Pointcut("within(com.diksha..*)")
	public void authorizationPointcut() {
		
	}
	
	@Before("authenticatingPointcut() && authorizationPointcut()")
	public void authenticate() {
		System.out.println("Authenticating the Request");
	}

}
