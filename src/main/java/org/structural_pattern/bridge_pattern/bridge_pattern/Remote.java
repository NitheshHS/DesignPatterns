package org.structural_pattern.bridge_pattern.bridge_pattern;

public abstract class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    abstract void powerOn();
    abstract void powerOff();
    abstract void setChannel(int channel);
    abstract void adjustVolume(int volume);

}
