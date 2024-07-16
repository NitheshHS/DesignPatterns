package org.structural_pattern.adaptor;

public class Main {
    public static void main(String[] args) {
        EmployeeAdaptor employeeAdaptor=new EmployeeAdaptor();
        populateEmployee(employeeAdaptor);
        DesignCard designCard=new DesignCard();
        System.out.println(designCard.buildCard(employeeAdaptor));

        System.out.println("*************************************");
        Employee employee=new Employee();
        populateEmployee(employee);
        EmployeeObjectAdaptor employeeObjectAdaptor=new EmployeeObjectAdaptor(employee);
        DesignCard designCard1=new DesignCard();
        System.out.println(designCard1.buildCard(employeeObjectAdaptor));
    }

    static void populateEmployee(Employee employee){
        employee.setName("Nithesh Gowda");
        employee.setDesignation("Automation QA");
        employee.setLocation("Bangalore");
    }
}
