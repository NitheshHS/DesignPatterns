package org.factory_method;

public class JsonMessage implements Message{
    @Override
    public void message() {
        System.out.println("{\n" +
                "  \"message\": \"Json message!\"\n" +
                "}");
    }
}
