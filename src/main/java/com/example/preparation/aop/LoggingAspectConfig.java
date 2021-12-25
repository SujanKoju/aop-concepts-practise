package com.example.preparation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author kojusujan1111@gmail.com 24/12/21
 */
@Aspect
@Configuration
public class LoggingAspectConfig {

    @Around("@annotation(com.example.preparation.aop.LoggingAspect)")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Aspect called before method execution");
        joinPoint.proceed();
        System.out.println("Aspect called after method execution");
    }

    @Before(value = "execution(* com.example.preparation.aop.EmployeeService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("Before method:" + joinPoint.getSignature());
    }

   /* @Before(value = "execution(* com.example.preparation.aop.EmployeeService.*(..)) && args(empId)")
    public void deleteLogging(JoinPoint joinPoint, String empId) {



        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Deleting Employee with id - " + empId);
    }*/
}
