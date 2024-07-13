package org.factory_method;

public class Main {
    public static void main(String[] args) {
        MessageFactory textMessageFactory = new TextMessageFactory();
        textMessageFactory.createMessage().message();

        MessageFactory jsonMessageFactory = new JsonMessageFactory();
        jsonMessageFactory.createMessage().message();
    }
}
