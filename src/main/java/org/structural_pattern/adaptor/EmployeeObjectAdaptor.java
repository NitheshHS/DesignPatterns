package org.structural_pattern.adaptor;

public class EmployeeObjectAdaptor implements Customer{

    private Employee employee;

    public EmployeeObjectAdaptor(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String firstName() {
        return employee.getName();
    }

    @Override
    public String currentLocation() {
        return employee.getLocation();
    }

    @Override
    public String occupation() {
        return employee.getDesignation();
    }
}
