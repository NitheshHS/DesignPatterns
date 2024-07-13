package org.builder_pattern;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dob;

    public User(UserBuilder builder) {
        this.firstName = builder.fName;
        this.lastName = builder.lName;
        this.address = builder.address;
        this.dob = builder.dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + "\n" +
                ", lastName='" + lastName + "\n" +
                ", address='" + address + "\n" +
                ", dob=" + dob +
                '}';
    }

    public static class UserBuilder{
        private String fName;
        private String lName;
        private String address;
        private LocalDate dob;


        public UserBuilder withFirstName(String firstName) {
            this.fName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lName = lastName;
            return this;
        }

        public UserBuilder withAddress(Address address) {
            this.address = address.toString();
            return this;
        }


        public UserBuilder withAge(LocalDate localDate) {
            Period period = Period.between(localDate, LocalDate.now());
            this.dob = localDate;
            return this;
        }

        public User build(){
           return  new User(this);
        }
    }
}
