package org.example;

public class Stereo {
    private String str;
    public Stereo(String s) {
        str = s;
    }
    public void On() {
        System.out.println(str + " Stereo On");
    }
    public void Off() {
        System.out.println(str + " Stereo Off");
    }
}
