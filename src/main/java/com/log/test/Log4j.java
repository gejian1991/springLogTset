package com.log.test;



import org.apache.log4j.Logger;

public class Log4j {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger("Loger");
        logger.info("log4j");
    }
}

