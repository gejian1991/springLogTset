package com.log.test;

import com.log.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
        annotationConfigApplicationContext.start();
        //两个不同日志
        /*JUL.main();
        Log4j.main();*/
    }
}
