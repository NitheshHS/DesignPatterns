package org.structural_pattern.adaptor.bridge_pattern;

public class BasicRemote extends Remote{

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.powerOn();
    }

    @Override
    void powerOff() {
        device.powerOff();
    }

    @Override
    void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    void adjustVolume(int volume) {
        device.adjustVolume(volume);
    }
}
