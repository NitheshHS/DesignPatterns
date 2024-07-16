package org.structural_pattern.bridge_pattern.bridge_pattern;

public class Main {
    public static void main(String[] args) {
        Device tv=new TV();
        Remote basicRemote=new BasicRemote(tv);
        basicRemote.powerOn();
        basicRemote.setChannel(1);
        basicRemote.adjustVolume(10);
        basicRemote.powerOff();
    }
}
