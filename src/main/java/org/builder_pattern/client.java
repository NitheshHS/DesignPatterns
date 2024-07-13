package org.builder_pattern;

import java.time.LocalDate;
import java.time.Month;

public class client {
    public static void main(String[] args) {

        Address address = new Address.AddressBuilder()
                .setCity("Blore")
                .setStreet("#123")
                .setState("Karnataka")
                .setZipcode("12345")
                .build();

        User user = new User.UserBuilder()
                .withFirstName("Nithesh")
                .withLastName("S")
                .withAddress(address)
                .withAge(LocalDate.of(1992, Month.MAY, 11))
                .build();

        System.out.println(user);
    }
}
