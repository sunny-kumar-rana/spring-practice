package spring_AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Around("execution(* spring_AOP.executor.Executor.execute(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Before method");

        Object result = joinPoint.proceed();

        System.out.println("After method");

        return result;
	}
}
