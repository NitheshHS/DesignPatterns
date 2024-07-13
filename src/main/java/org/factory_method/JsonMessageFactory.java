package org.factory_method;

public class JsonMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
