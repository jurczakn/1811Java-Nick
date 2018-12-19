package com.lurkon.books.utils;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.lurkon.books.BookStore;

@Component
@Aspect
public class LoggingAspect
{
	private Logger log = Logger.getLogger(BookStore.class);
	
	@Around("everything()")
	public Object logger(ProceedingJoinPoint pjp)
	{
		Object obj = null;
		log.info("Method with signature "+pjp.getSignature()+" called.");
		log.info("With arguments: "+Arrays.toString(pjp.getArgs()));
		
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			log.error(e.getMessage());
			for(StackTraceElement s : e.getStackTrace())
			{
				log.warn(s);
			}
		}
		log.info(pjp.getSignature()+" returned: "+obj);
		return obj;
	}
	
	//hook for everything
	@Pointcut("execution(* com.lurkon..*(..))")
	public void everything(){}
}