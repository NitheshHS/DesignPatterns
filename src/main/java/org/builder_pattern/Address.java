package org.builder_pattern;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(AddressBuilder builder){
        street = builder.street;
        city = builder.city;
        state = builder.state;
        zipcode = builder.zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + "\n" +
                ", city='" + city + "\n" +
                ", state='" + state + "\n" +
                ", zipcode='" + zipcode + "\n" +
                '}';
    }

    public static class AddressBuilder{
        private String street;
        private String city;
        private String state;
        private String zipcode;

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder setZipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
