package org.singleton;

public class Main {
    public static void main(String[] args) {
        EagerInstance eagerInstance=EagerInstance.getInstance();
        System.out.println(eagerInstance);
        EagerInstance eagerInstance1=EagerInstance.getInstance();
        System.out.println(eagerInstance1);
    }
}
