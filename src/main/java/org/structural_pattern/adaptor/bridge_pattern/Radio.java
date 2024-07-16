package org.structural_pattern.adaptor.bridge_pattern;

public class Radio implements Device{
    private boolean powerOn = false;
    private int channel = 1;
    private int volume = 5;
    @Override
    public void powerOn() {
        this.powerOn = true;
        System.out.println("Radio power on");
    }

    @Override
    public void powerOff() {
        this.powerOn = false;
        System.out.println("TV power off");
    }

    @Override
    public void setChannel(int channel) {
        if(powerOn){
            this.channel = channel;
            System.out.println("Channel set to: "+this.channel);
        }else{
            System.out.println("Radio is not on");
        }
    }

    @Override
    public void adjustVolume(int volume) {
        if(powerOn){
            this.volume = volume;
            System.out.println("Volume set to: "+this.volume);
        }else{
            System.out.println("Radio is not on");
        }
    }
}
