package org.singleton;

public class EagerInstance {
    private EagerInstance(){}

    private static final EagerInstance INSTANCE=new EagerInstance();

    public static EagerInstance getInstance(){
        return INSTANCE;
    }
}
