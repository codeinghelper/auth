package com.github.codeinghelper.auth;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionRight {

    String actionCode() default " ";

    boolean require() default true;


}
