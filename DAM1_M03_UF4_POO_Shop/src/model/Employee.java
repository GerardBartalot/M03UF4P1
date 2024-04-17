package model;

import main.Logable;

public class Employee extends Person implements Logable {
    
	private int employeeId;
    private static final int USER = 123;
    private static final String PASSWORD = "test";

    
    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    
    @Override
    public boolean login(int user, String password) {
        return user == USER && password.equals(PASSWORD);
    }

    
    // Otros métodos de la clase Employee
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}

