package org.abstract_factory;

public class EC2Instance implements Instances{
    @Override
    public void start() {
        System.out.println("Started EC2 instance!!");
    }

    @Override
    public void stop() {
        System.out.println("Stopped EC2 instance!");
    }
}
