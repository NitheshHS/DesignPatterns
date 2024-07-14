package org.abstract_factory;

public class GoogleCloudInstance implements Instances{
    @Override
    public void start() {
        System.out.println("Started GoogleCloudInstance instance!");
    }

    @Override
    public void stop() {
        System.out.println("Stopped GoogleCloudInstance instance!");
    }
}
