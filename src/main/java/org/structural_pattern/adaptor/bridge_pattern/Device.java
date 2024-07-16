package org.structural_pattern.adaptor.bridge_pattern;

public interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void adjustVolume(int volume);
}
