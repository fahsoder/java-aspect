package javaaspect.app.aspect.annotation;

import javaaspect.app.model.LogTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInterface {

    String value() default "";

    LogTypeEnum type() default LogTypeEnum.INFO;
}
