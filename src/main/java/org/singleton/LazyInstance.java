package org.singleton;

public class LazyInstance {
    private LazyInstance(){}

    private static LazyInstance INSTANCE;

    public static LazyInstance getInstance(){
        if(INSTANCE==null){
            synchronized (LazyInstance.class){
                if(INSTANCE ==null){
                    INSTANCE=new LazyInstance();
                    return INSTANCE;
                }
            }
        }
        return null;
    }
}
