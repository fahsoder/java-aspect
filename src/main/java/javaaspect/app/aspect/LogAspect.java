package javaaspect.app.aspect;

import javaaspect.app.aspect.annotation.LogInterface;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Around("@annotation(logInterface)")
    public void logInterface(ProceedingJoinPoint joinPoint, LogInterface logInterface) throws Throwable {

        String message = logInterface.value().isEmpty() ? "Default method called" : logInterface.value();

        switch (logInterface.type()) {
            case INFO -> log.info(message, joinPoint.getSignature());
            case WARN -> log.warn(message, joinPoint.getSignature());
            case ERROR -> log.error(message, joinPoint.getSignature());
        }

        log.info("Finishing execution of aspect...");

    }
}
