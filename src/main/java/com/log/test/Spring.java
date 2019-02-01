package com.log.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 不加桥接器时走的log4j
 */
public class Spring {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("spring");
        log.info("spring");
    }
}
