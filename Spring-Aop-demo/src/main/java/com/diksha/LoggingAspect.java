package com.diksha;

import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.*;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.diksha.ShoppingCart.checkout(..))")
	public void Beforelogger(JoinPoint jp) {
//		System.out.println(jp.getSignature());
//		System.out.println(jp.getKind());
//		System.out.println(jp.getStaticPart());
		String arg = jp.getArgs()[0].toString();
		System.out.println("BeforeLoggers with Argument" + arg);
	}

	@After("execution(* *.*.*.checkout(..))")
	public void Afterlogger() {
		System.out.println("AfterLoggers");
	}

	@Pointcut("execution(* com.diksha.ShoppingCart.quantity(..))")
	public void AfterReturningpointCut() {
		System.out.println();
	}

	@AfterReturning(pointcut = "AfterReturningpointCut()", returning = "retVal")
	public void AfterReturning(String retVal) {
		System.out.println("After Returning :"+ retVal);
	}
}
