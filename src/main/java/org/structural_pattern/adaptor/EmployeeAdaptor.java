package org.structural_pattern.adaptor;

public class EmployeeAdaptor extends Employee implements Customer{
    @Override
    public String firstName() {
        return this.getName();
    }

    @Override
    public String currentLocation() {
        return this.getLocation();
    }

    @Override
    public String occupation() {
        return this.getDesignation();
    }
}
