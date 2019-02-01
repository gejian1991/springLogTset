package com.log.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCL {
    public static void main(String[] args) {
        Log log= LogFactory.getLog("JCL");
        //log4j
        log.info("JCL");
    }
}
