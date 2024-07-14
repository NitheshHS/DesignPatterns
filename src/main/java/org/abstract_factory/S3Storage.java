package org.abstract_factory;

public class S3Storage implements Storage{
    @Override
    public void getId() {
        System.out.println("S3 storage!");
    }
}
