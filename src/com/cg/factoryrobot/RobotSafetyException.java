package com.cg.factoryrobot;

/**
 * Custom exception class for robot safety validation errors.
 */
public class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message);
    }
}
