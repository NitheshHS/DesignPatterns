package org.abstract_factory;

public class GoogleCloudStorage implements Storage{
    @Override
    public void getId() {
        System.out.println("Google cloud storage!");
    }
}
