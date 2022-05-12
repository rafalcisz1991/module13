package com.example.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.example.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Logging the event");
    }

    @After("execution(* com.example.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEndEvent() {
        LOGGER.info("Final logging of the event");
    }

    //Nie uwzględnia mi metody, liczącej czas trwania sprawdzanej metody processOrder() - tak jak w module 24.3.

    /*@Around("execution(* com.example.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();                  // [1]
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();                    // [2]
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");   // [3]
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());               // [4]
            throw throwable;
        }
        return result;
    }*/
}
