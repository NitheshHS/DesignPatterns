package org.factory_method;

public class TextMessage implements Message{
    @Override
    public void message() {
        System.out.println("Hey, there this is text message!");
    }
}
