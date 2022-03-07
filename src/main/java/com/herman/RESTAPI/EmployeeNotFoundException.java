package com.herman.RESTAPI;

class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee" + id);
    }
}
