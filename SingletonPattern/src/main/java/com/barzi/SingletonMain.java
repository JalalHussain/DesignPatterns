package com.barzi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main class.
 *
 * @author Barzi
 */
public class SingletonMain {

    private static final Logger logger = LoggerFactory.getLogger(SingletonMain.class);  //Logger instance for logging

    /**
     * @param args Command line arguments.
     */
    public static void main(String args[]) {
        logger.info("Singleton pattern code example");
    }
}
