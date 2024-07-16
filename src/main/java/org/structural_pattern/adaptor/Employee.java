package org.structural_pattern.adaptor;

public class Employee {
    private String name;
    private String location;
    private String designation;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Employee setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }
}
