package com.nhnacademy.edu.springframework.messagesender;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ElapsedTimeAspect {
    @Around("execution(* com.nhnacademy.edu.springframework.messagesender..messageSend(..))")
    public Object executeMessage(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch("logger");

        try {
            stopWatch.start();
            Object result = pjp.proceed();
            return result;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }

    }
}
