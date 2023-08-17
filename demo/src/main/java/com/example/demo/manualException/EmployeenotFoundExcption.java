package com.example.demo.manualException;

public class EmployeenotFoundExcption extends  Exception{

    public EmployeenotFoundExcption() {
        super();
    }

    public EmployeenotFoundExcption(String message) {
        super(message);
    }

    public EmployeenotFoundExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeenotFoundExcption(Throwable cause) {
        super(cause);
    }

    protected EmployeenotFoundExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
