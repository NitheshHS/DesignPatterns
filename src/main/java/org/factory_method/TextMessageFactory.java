package org.factory_method;

public class TextMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
