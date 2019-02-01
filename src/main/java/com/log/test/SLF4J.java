package com.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SLF4J{
    /**
     * 走的jul
     * @param args
     */
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger("SLF4j");
        logger.info("slf4j");
    }
}
